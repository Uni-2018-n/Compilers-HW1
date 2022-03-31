
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20141202 (SVN rev 60)
//----------------------------------------------------

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20141202 (SVN rev 60) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\024\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\003\012\000\002\003\010\000\002\003\007" +
    "\000\002\003\012\000\002\003\005\000\002\014\004\000" +
    "\002\014\002\000\002\015\004\000\002\015\002\000\002" +
    "\016\007\000\002\016\004\000\002\016\002\000\002\017" +
    "\004\000\002\017\002\000\002\007\005\000\002\007\003" +
    "\000\002\007\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\052\000\004\022\005\001\002\000\006\002\054\022" +
    "\005\001\002\000\004\011\007\001\002\000\006\002\uffff" +
    "\022\uffff\001\002\000\010\012\010\022\011\023\012\001" +
    "\002\000\010\002\ufffa\014\050\022\ufffa\001\002\000\010" +
    "\011\027\012\ufff6\016\026\001\002\000\006\012\ufff1\016" +
    "\014\001\002\000\004\012\025\001\002\000\010\012\ufff3" +
    "\022\016\023\017\001\002\000\004\012\ufff2\001\002\000" +
    "\004\011\021\001\002\000\006\012\ufff1\016\014\001\002" +
    "\000\004\012\ufff4\001\002\000\010\012\ufff3\022\016\023" +
    "\017\001\002\000\004\012\023\001\002\000\006\012\ufff1" +
    "\016\014\001\002\000\004\012\ufff5\001\002\000\006\002" +
    "\ufffc\022\ufffc\001\002\000\006\012\ufff8\022\046\001\002" +
    "\000\010\012\ufff3\022\016\023\017\001\002\000\004\012" +
    "\031\001\002\000\004\014\032\001\002\000\006\022\033" +
    "\023\035\001\002\000\006\005\uffef\015\uffef\001\002\000" +
    "\006\005\036\015\037\001\002\000\006\005\uffee\015\uffee" +
    "\001\002\000\006\022\033\023\035\001\002\000\006\002" +
    "\ufffe\022\ufffe\001\002\000\006\005\ufff0\015\ufff0\001\002" +
    "\000\004\012\042\001\002\000\006\012\ufff1\016\014\001" +
    "\002\000\004\012\044\001\002\000\006\002\ufffb\022\ufffb" +
    "\001\002\000\004\012\ufff7\001\002\000\006\012\ufff6\016" +
    "\026\001\002\000\004\012\ufff9\001\002\000\006\022\033" +
    "\023\035\001\002\000\006\005\036\015\052\001\002\000" +
    "\006\002\ufffd\022\ufffd\001\002\000\006\002\000\022\000" +
    "\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\052\000\006\002\003\003\005\001\001\000\004\003" +
    "\052\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\015\027\001\001\000" +
    "\004\017\012\001\001\000\002\001\001\000\004\016\014" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\017" +
    "\017\001\001\000\002\001\001\000\004\016\021\001\001" +
    "\000\002\001\001\000\004\017\023\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\014\044\001\001\000\004" +
    "\016\040\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\007\033\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\007\037\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\017\042" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\015\046\001\001\000\002\001\001\000\004" +
    "\007\050\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 return s.next_token(); 
    }


    // Connect this parser to a scanner!
    Scanner s;
    Parser(Scanner s){ this.s=s; }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // program ::= program expr_list 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // program ::= expr_list 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // expr_list ::= IDENT LPAREN IDENT func_params_2 RPAREN LBRAKET expr RBRAKET 
            {
              Object RESULT =null;
		int fNameleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).left;
		int fNameright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).right;
		Object fName = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-7)).value;
		int param1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).left;
		int param1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).right;
		Object param1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-5)).value;
		int paramNleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int paramNright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Object paramN = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 System.out.println("public static String "+fName+"("+param1+paramN+"){return "+e+";}");
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_list",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expr_list ::= IDENT LPAREN RPAREN LBRAKET expr RBRAKET 
            {
              Object RESULT =null;
		int fNameleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).left;
		int fNameright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).right;
		Object fName = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-5)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 System.out.println("public static String "+fName+"(){return "+e+";}");
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_list",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expr_list ::= IDENT LPAREN STRING_LITERAL func_args_2 RPAREN 
            {
              Object RESULT =null;
		int fNameleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int fNameright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Object fName = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int arg1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int arg1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String arg1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int argNleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int argNright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object argN = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 System.out.println(fName+"("+arg1+argN+")");
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_list",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr_list ::= IDENT LPAREN IDENT LPAREN func_args RPAREN func_args_2 RPAREN 
            {
              Object RESULT =null;
		int fNameleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).left;
		int fNameright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).right;
		Object fName = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-7)).value;
		int arg1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).left;
		int arg1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).right;
		Object arg1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-5)).value;
		int argIleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int argIright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Object argI = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int argNleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int argNright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object argN = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 System.out.println(fName+"("+arg1+"("+argI+")"+argN+")"); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_list",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr_list ::= IDENT LPAREN RPAREN 
            {
              Object RESULT =null;
		int fNameleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int fNameright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object fName = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		 System.out.println(fName+"()");
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_list",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // func_params ::= IDENT func_params_2 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int nextleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int nextright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object next = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = ""+id + next;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("func_params",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // func_params ::= 
            {
              Object RESULT =null;
		 RESULT = ""; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("func_params",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // func_params_2 ::= COMMA func_params 
            {
              Object RESULT =null;
		int nextleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int nextright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object next = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = ", "+next;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("func_params_2",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // func_params_2 ::= 
            {
              Object RESULT =null;
		 RESULT = ""; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("func_params_2",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // func_args ::= IDENT LPAREN func_args RPAREN func_args_2 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int insideleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int insideright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object inside = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int nextleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int nextright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object next = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = id+"("+inside+")"+next;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("func_args",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // func_args ::= STRING_LITERAL func_args_2 
            {
              Object RESULT =null;
		int strleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int strright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String str = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int nextleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int nextright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object next = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = str+next; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("func_args",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // func_args ::= 
            {
              Object RESULT =null;
		 RESULT = ""; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("func_args",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // func_args_2 ::= COMMA func_args 
            {
              Object RESULT =null;
		int nextleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int nextright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object next = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = ", "+next;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("func_args_2",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // func_args_2 ::= 
            {
              Object RESULT =null;
		 RESULT = ""; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("func_args_2",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expr ::= expr PLUS expr 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = e1+"+"+e2;           
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expr ::= IDENT 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = ""+a; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expr ::= STRING_LITERAL 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = "\""+s+"\""; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}