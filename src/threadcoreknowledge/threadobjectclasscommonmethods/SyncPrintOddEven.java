package threadcoreknowledge.threadobjectclasscommonmethods;

public class SyncPrintOddEven {
    private static int count;
    private static final Object lock = new Object();
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (count<100) {
                    synchronized (lock) {
                        if ((count&1)==0) {
                            System.out.println(Thread.currentThread().getName()+":"+count);
                            count++;
                        }
                    }
                }
            }
        }, "偶数").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (count<100) {
                    synchronized (lock) {
                        if ((count&1)!=0) {
                            System.out.println(Thread.currentThread().getName()+":"+count);
                            count++;
                        }
                    }
                }
            }
        }, "奇数").start();
    }
}
