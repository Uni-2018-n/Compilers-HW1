import java_cup.runtime.*;

%%
/* ----------------- Options and Declarations Section----------------- */

/*
   The name of the class JFlex will create will be Scanner.
   Will write the code to the file Scanner.java.
*/
%class Scanner

/*
  The current line number can be accessed with the variable yyline
  and the current column number with the variable yycolumn.
*/
%line
%column

/*
   Will switch to a CUP compatibility mode to interface with a CUP
   generated parser.
*/
%cup
%unicode

/*
  Declarations

  Code between %{ and %}, both of which must be at the beginning of a
  line, will be copied letter to letter into the lexer class source.
  Here you declare member variables and functions that are used inside
  scanner actions.
*/

%{
    /**
        The following two methods create java_cup.runtime.Symbol objects
    **/
    StringBuffer stringBuffer = new StringBuffer();
    private Symbol symbol(int type) {
       return new Symbol(type, yyline, yycolumn);
    }
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}

/*
  Macro Declarations

  These declarations are regular expressions that will be used latter
  in the Lexical Rules Section.
*/

/* A line terminator is a \r (carriage return), \n (line feed), or
   \r\n. */
LineTerminator = \r|\n|\r\n

/* White space is a line terminator, space, tab, or line feed. */
WhiteSpace     = {LineTerminator} | [ \t\f]

/* A literal integer is is a number beginning with a number between
   one and nine followed by zero or more numbers between zero and nine
   or just a zero.  */
%state STRING

Ident = [a-zA-Z$_] [a-zA-Z0-9$_]*

%%
/* ------------------------Lexical Rules Section---------------------- */

<YYINITIAL> {
/* operators */
 "reverse"      { return symbol(sym.REVERSE); }
 "else"      { return symbol(sym.ELSE); }
 "prefix"      { return symbol(sym.PREFIX); }
 "if"      { return symbol(sym.IFS); }
 "+"      { return symbol(sym.PLUS); }
 "("      { return symbol(sym.LPAREN); }
 ")"      { return symbol(sym.RPAREN); }
 "{"      { return symbol(sym.LBRAKET); }
 "}"      { return symbol(sym.RBRAKET); }
 ","      { return symbol(sym.COMMA); }
 \"       { stringBuffer.setLength(0); yybegin(STRING); }
{WhiteSpace} { /* just skip what was found, do nothing */ }
{Ident}           { return symbol(sym.IDENT, yytext()); }
}



<STRING> {
      \"                             { yybegin(YYINITIAL);
                                       return symbol(sym.STRING_LITERAL, "\""+stringBuffer.toString()+"\""); }
      [^\n\r\"\\]+                   { stringBuffer.append( yytext() ); }
      \\t                            { stringBuffer.append('\t'); }
      \\n                            { stringBuffer.append('\n'); }

      \\r                            { stringBuffer.append('\r'); }
      \\\"                           { stringBuffer.append('\"'); }
      \\                             { stringBuffer.append('\\'); }
}


/* No token was found for the input so through an error.  Print out an
   Illegal character message with the illegal character that was found. */
[^]                    { throw new Error("Illegal character <"+yytext()+">"); }
