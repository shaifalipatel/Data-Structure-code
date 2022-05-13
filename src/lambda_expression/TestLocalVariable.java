package lambda_expression;

public class TestLocalVariable {
    public static void main(String[] args){
       /* local variable used in lambda, by default final or effective final*/
        /* variable used in lambda expression can modify the value of local variable*/
        int num = 10;
        NumericFucn numericFucn = (n) -> {
            int variable = num +n;
            return variable;
        };
    }
    
}
