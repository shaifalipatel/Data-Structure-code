package thread;

public class NewThreadImpliment implements Runnable {

    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        System.out.println("Inside Thread");
    }

    public static void main(String[] args){
        NewThreadImpliment newThreadImpliment = new NewThreadImpliment();
        Thread t = new Thread(newThreadImpliment);
        t.start();
        System.out.println("OutSide Thread");
    }
}
