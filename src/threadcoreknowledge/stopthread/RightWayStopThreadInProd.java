package threadcoreknowledge.stopthread;

public class RightWayStopThreadInProd implements Runnable{

    @Override
    public void run() {
        while (true) {
            System.out.println("go");
            try {
                throwInMethod();
            } catch (InterruptedException e) {
                //保存日志，停止程序
                System.out.println("保存日志");
                e.printStackTrace();
            }
        }
    }
    private void throwInMethod() throws InterruptedException {

        Thread.sleep(2000);

    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new RightWayStopThreadInProd());
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }
}
