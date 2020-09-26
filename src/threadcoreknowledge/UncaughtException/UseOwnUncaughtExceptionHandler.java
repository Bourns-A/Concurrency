package threadcoreknowledge.UncaughtException;

public class UseOwnUncaughtExceptionHandler implements Runnable {
    public static void main(String[] args) throws InterruptedException {

        Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandler("Handler1"));

        new Thread(new CantCatchDirectly(), "myThread1").start();
        Thread.sleep(300);
        new Thread(new CantCatchDirectly(), "myThread2").start();
        Thread.sleep(300);
        new Thread(new CantCatchDirectly(), "myThread3").start();
        Thread.sleep(300);
        new Thread(new CantCatchDirectly(), "myThread4").start();
        //Thread.sleep(300);

    }

    @Override
    public void run() {
        throw new RuntimeException();
    }
}
