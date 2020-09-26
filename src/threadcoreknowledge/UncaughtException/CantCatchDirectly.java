package threadcoreknowledge.UncaughtException;

public class CantCatchDirectly implements Runnable{

    public static void main(String[] args) throws InterruptedException {
        try{
            new Thread(new CantCatchDirectly(), "myThread1").start();
            Thread.sleep(300);
            new Thread(new CantCatchDirectly(), "myThread2").start();
            Thread.sleep(300);
            new Thread(new CantCatchDirectly(), "myThread3").start();
            Thread.sleep(300);
            new Thread(new CantCatchDirectly(), "myThread4").start();
            //Thread.sleep(300);
        } catch (RuntimeException e) {
            System.out.println("caught exception");
        }


    }

    @Override
    public void run() {
        throw new RuntimeException();
    }
}
