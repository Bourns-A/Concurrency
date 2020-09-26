package threadcoreknowledge.threadobjectclasscommonmethods;

public class WaitNotifyPrintOddEvenBetter {
    private static int count = 0;
    private static final Object lock = new Object();
    static class TurningRunner implements Runnable {

        @Override
        public void run() {
            while (count<=100) {
                synchronized (lock) {
                    System.out.println(Thread.currentThread().getName()+":"+count);
                    count++;
                    lock.notifyAll();
                    if (count<=100) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new TurningRunner(), "偶数").start();
        new Thread(new TurningRunner(), "奇数").start();
    }
}
