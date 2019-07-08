package thread;

public class ThreadTest {
    public static void main(String[] args) {
        Runnable threadjob = new Myrunnable();
        Thread myThread = new Thread(threadjob);
        myThread.start();
        System.out.println("back in main");
    }
}
