package threadcoreknowledge.createthreads;

/*
    同时使用runnable和thread两种方式
 */

public class BothRunnableThread {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("using runnable");
            }
        }) {
            @Override
            public void run() {
                System.out.println("Using Thread");
            }
        }.start();
    }
}
