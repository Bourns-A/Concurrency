package threadcoreknowledge.stopthread;

public class RightWayStopThreadWithoutSleep implements Runnable {

    @Override
    public void run() {
        int num = 0;
        while (num<=Integer.MAX_VALUE/2 && !Thread.currentThread().isInterrupted()) {
            if (num %10000 ==0) {
                System.out.println(num+"是10000的倍数");
            }
            num++;
        }
        System.out.println("Job Done");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new RightWayStopThreadWithoutSleep());
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
    }
}
