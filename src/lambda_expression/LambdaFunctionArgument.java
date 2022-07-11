package lambda_expression;

public class LambdaFunctionArgument
{
    static int stringOperation(NumericFucn numericFucn, int input){
        return numericFucn.funcn(input);
    }
    public static void main(String[] args){

        System.out.println("Operation value is" + stringOperation((n)-> n+2, 4));

    }
}
