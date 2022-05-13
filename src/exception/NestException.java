package exception;

public class NestException {
    public static void main(String args[]){
        int a = 2;
        try{
            int b= 42/0;
            nexttry(a);
        }
        catch (ArithmeticException e){
            System.out.println("Exception" + e);
        }

    }

    static void nexttry(int a) {
        try{
            if(a==1)
                a= a/(a-a);
            if(a==2){
                int c[] = {1};
                c[42] = a;
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
