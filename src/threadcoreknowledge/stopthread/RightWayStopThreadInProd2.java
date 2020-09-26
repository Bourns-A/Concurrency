package threadcoreknowledge.stopthread;

/*
catch子语句中调用Thread.currentThread().interrupt()回复设置中断状态，以便于在后续执行中依然能够检查刚才发生的中断
再回到刚才的类，补充中断跳出
 */

public class RightWayStopThreadInProd2 implements Runnable{

    @Override
    public void run() {
        while (true) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Interrupted");
                break;
            }
                reInterrupt();
                //保存日志，停止程序

        }
    }
    private void reInterrupt()  {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new RightWayStopThreadInProd2());
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }
}
