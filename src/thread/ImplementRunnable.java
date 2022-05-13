package thread;

public class ImplementRunnable {

    public static void main(String[] args){
        new NewThread();
        try{
            for(int i = 5; i>0 ; i--){
                System.out.println("Parent thread"+ i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e){
            System.out.println("Parent Interrupted");
        }
        System.out.println("Exit Parent Thread");
    }
}

class NewThread implements Runnable{
    Thread t;
    NewThread(){
       t = new Thread(this, "Demo Thread");
        System.out.println("Child Thread running ,"+ t);
        t.start();
    }

    @Override
    public void run() {
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
