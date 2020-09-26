package threadcoreknowledge.createthreads;

/*
using thread class
 */

public class ThreadStyle extends Thread {

    @Override
    public void run(){
        System.out.println("using thread class");
    }

    public static void main(String[] args) {
        new ThreadStyle().start();
    }
}
