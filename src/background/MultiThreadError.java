package background;

import java.util.concurrent.atomic.AtomicInteger;

public class MultiThreadError implements Runnable{
    int index = 0;
    static MultiThreadError instance = new MultiThreadError();
    static AtomicInteger realIndex = new AtomicInteger();
    static AtomicInteger wrongCount = new AtomicInteger();
    final boolean[] marked = new boolean[10000000];
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(instance);
        Thread thread2 = new Thread(instance);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(instance.index);
        System.out.println(realIndex.get());
        System.out.println(wrongCount.get());
    }

    @Override
    public void run() {

//        while (index<10000) {
//            index++;
//        }
        for (int i=0; i<10000; i++) {
            index++;
            realIndex.incrementAndGet();
            if (marked[index]==true) {
                System.out.println("error at "+index);
                wrongCount.incrementAndGet();
            }
            marked[index] = true;
        }
    }
}
