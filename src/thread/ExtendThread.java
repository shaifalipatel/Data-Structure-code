package thread;

public class ExtendThread {
    public static void main(String[] args){
        new NewThreadClass();

        try{
            for(int i = 5; i>0 ; i--){
                System.out.println("Parent thread"+ i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Parent Interrupted");
        }
        System.out.println("Exit Parent thread");
    }


}

class NewThreadClass extends Thread{
    NewThreadClass(){
        super("Demo Thread");
        System.out.println("New Thread Created ,"+ this);
        start();
    }

    @Override
    public void run(){
        try{
            for(int i = 5; i>0 ; i--){
                System.out.println("Child thread"+ i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Child Interrupted");
        }
        System.out.println("Exit child thread");
    }
}
