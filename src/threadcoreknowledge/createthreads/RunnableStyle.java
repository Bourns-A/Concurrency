package threadcoreknowledge.createthreads;

/*
using runnable method
 */

public class RunnableStyle implements Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableStyle());
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("Using Runnable Method");
    }
}
