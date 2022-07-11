package exception;

public class ThrowException {
    public static void main(String args[]){
        try{
           checkThrow();
           checkNewThrow();
        }
        catch (ArithmeticException e){
            System.out.println("inside main method");
            System.out.println("Exception" + e);
        }

    }

     static void checkThrow() {
         try{
             throw new ArithmeticException();
         }
         catch (ArithmeticException e){
             System.out.println("inside checkThrow method");
             throw e;
         }
    }

    static void checkNewThrow() throws ArithmeticException{
        System.out.println("inside checkNewThrow method");
            throw new ArithmeticException();
        }
}
