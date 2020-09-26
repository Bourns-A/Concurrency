package threadcoreknowledge.stopthread.volatiledemo;

/*
volatile的局限：看似可行
 */
public class WrongWay implements Runnable {
    private volatile boolean canceled = false;

    @Override
    public void run() {
        int num=0;
        try {
            while (num <= 100000 && !canceled) {
                if (num % 100 == 0) {
                    System.out.println(num);
                }
                num++;
                Thread.sleep(1);
            }
        }catch (InterruptedException e) {
                e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        WrongWay r = new WrongWay();
        Thread thread = new Thread(r);
        thread.start();
        Thread.sleep(5000);
        r.canceled = true;
    }
}
