package thread;

public class NewThreadImpl extends Thread {
    public static void main(String[] args){
        NewThreadImpl newThread = new NewThreadImpl();
        newThread.start();
        System.out.println("back to main method");
    }

    @Override
    public void run() {
        System.out.println("Thread called");
    }
}
