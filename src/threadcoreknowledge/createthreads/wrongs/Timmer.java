package threadcoreknowledge.createthreads.wrongs;

import java.util.Timer;
import java.util.TimerTask;

public class Timmer {

    public static void main(String[] args) {

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }, 1000, 1000);
    }
}
