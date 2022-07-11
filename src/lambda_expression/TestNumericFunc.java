package lambda_expression;

public class TestNumericFunc {

    public static void main(String[] args){

        NumericFucn factorial = (n) -> {
            int result = 1;
            for(int i=1; i<=n; i++){
                result = result*i;
            }
            return result;
        };

        System.out.println("Factorial of 3 is "+ factorial.funcn(3));
    }
}
