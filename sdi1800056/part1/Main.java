import java.io.IOException;

class Main {
    public static void main(String[] args) {

        while(true){
            try {
                System.out.println((new calculatorEvaluator(System.in)).eval());
            } catch (IOException | ParseError e) {
                if(e.getMessage() == ""){
                    return;
                }
                System.err.println(e.getMessage());

            }
        }
    }
}

