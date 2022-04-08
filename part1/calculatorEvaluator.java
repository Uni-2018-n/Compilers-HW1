import java.io.InputStream;
import java.io.IOException;

class calculatorEvaluator {
    private final InputStream in;

    private int lookahead;
    public calculatorEvaluator(InputStream in) throws IOException {
        this.in = in;
        lookahead = in.read();
    }
    
    private void consume(int symbol) throws IOException, ParseError {
        if (lookahead == symbol)
            lookahead = in.read();
        else
            throwExp();
    }

    private boolean isDigit(int c) {
        return '0' <= c && c <= '9';
    }

    private int evalDigit(int c) {
        return c - '0';
    }

    private void throwExp() throws IOException, ParseError {
        int c = lookahead;
        while(c != '\n' && c != -1){
            c= in.read();
        }
        throw new ParseError(lookahead);
    }

    public int eval() throws IOException, ParseError {
        int value = Goal();
        if(lookahead != '\n' && lookahead != -1){//incase we didnt read all the input, throw parse error
            throwExp();
        }
        return value;
    }

    private int Goal() throws IOException, ParseError {
        if(isDigit(lookahead) || lookahead == '('){
            int term = Term();
            int expr = Expr(term);
            return expr;
        }
         
        throwExp();
        return -1;
    }

    private int Term() throws IOException, ParseError {
        int num = Num();
        int term2 = Term2(num);
        return term2;
    }

    private int Expr(int curr) throws IOException, ParseError {
        switch(lookahead){
            case '^':
                consume('^');
                int term = Term();
                int f = curr ^ term;
                int expr = Expr(f);
                return expr;
            case '\n':
                return curr;
            case ')':
                return curr;
        }
        throwExp();
        return -1;
    }

    private int Term2(int curr) throws IOException, ParseError {
        switch(lookahead){
            case '&':
                consume('&');
                int num = Num();
                int f = curr & num;
                int term2 = Term2(f);
                return term2;
            case '^':
                return curr;
            case ')':
                return curr;
            case '\n':
                return curr;
        }
        throwExp();
        return -1;
    }

    private int Num() throws IOException, ParseError {
        if(isDigit(lookahead)){
            int curr = evalDigit(lookahead);
            consume(lookahead);
            return curr;
        }else{
            consume('(');
            int goal = Goal();
            consume(')');
            return goal;
        }
    }
}
