Antonis Kalamakis SDI1800056

For compilation,
inside each directory simply:
~make compile
~make execute < input.txt

Part 1:

Used most of the code from the examples but with my own grammar.

                            first           follow         first+
goal -> term expr           {0,..,9, (}     {$, )}          {0,..,9, (}

expr -> ^ term expr         {^}             {$, )}          {^}
    | e                     {e}                             {$, )}

term -> num term2           {0,...,9, (}    {^, ), $}       {0,..,9, (}

term2 -> & num term2        {&}             {$, ^, )}       {&}
    | e                     {e}                             {$, ^, )}

num -> 0                    {0}             {&, $, ^, )}    {0}
    | ..                    {..}                            {..}
    | 9                     {9}                             {9}
    | ( goal )              {(}                             {(}



---------------------------------------------------------------------------------------------------
	      |     '0' .. '9'     |    '('    |    ')'     |      '^'      |      '&'      |    $    |
---------------------------------------------------------------------------------------------------
	      |                    |           |            |               |               |         |
goal      |     term expr      | term expr |    error   |     error     |     error     |  error  |
          |                    |           |            |               |               |         |
---------------------------------------------------------------------------------------------------
	      |                    |           |            |               |               |         |
expr      |       error        |   error   |      e     |  ^ term expr  |     error     |    e    |
          |                    |           |            |               |               |         |
---------------------------------------------------------------------------------------------------
	      |                    |           |            |               |               |         |
term      |     num term2      | num term2 |    error   |     error     |     error     |  error  |
          |                    |           |            |               |               |         |
---------------------------------------------------------------------------------------------------
	      |                    |           |            |               |               |         |
term2     |        error       |   error   |      e     |       e       |  & num term2  |   e     |
          |                    |           |            |               |               |         |
---------------------------------------------------------------------------------------------------
	      |                    |           |            |               |               |         |
num       |     '0' .. '9'     |  ( goal ) |    error   |     error     |     error     |  error  |
          |                    |           |            |               |               |         |
---------------------------------------------------------------------------------------------------

Part 2:

Grammar can accept all type of cases.
Can be only function declarations, only expressions on the "main" body, or even multiple scenarios of both.

Some of the non-terminals are exactly the same with the only difference that they use the item_inside non-terminal. 
This was a very important implementation choice since outside a function declaration we don't have variables. We only have function callings. Inside the functions declarations though we might have parameters in which there is no need to use 'ID()' because they are simple IDs.

At the start of the implementation I tried to use the normal if/else java statements and the ternary for the statements inside the if/else statements but this caused to have multiple copy/pastes of the same grammar rules in which there is no reason since we can simply just use ternary statements since it's the same.