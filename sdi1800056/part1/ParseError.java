public class ParseError extends Exception {
    String msg = "";
    public ParseError(int lookahead) {
        if(lookahead == -1){
            msg = "";
        }else{
            msg = "parse error";
        }
    }
    public String getMessage() {
	    return msg;
    }
}
