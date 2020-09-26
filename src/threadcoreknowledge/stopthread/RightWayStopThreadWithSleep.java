package threadcoreknowledge.stopthread;

public class RightWayStopThreadWithSleep {


    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            int num=0;
            try {
                while (num<=300 && !Thread.currentThread().isInterrupted()) {
                    if (num%100==0) {
                        System.out.println(num+"是100倍数");
                    }
                    num++;
                }
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(500);
        thread.interrupt();
    }
}
