package jmm;

public class FieldVisiablity {
    int a=1;
    int b=2;

    public static void main(String[] args) {
        while (true) {
            FieldVisiablity test = new FieldVisiablity();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    test.change();
                }
            }).start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    test.print();
                }
            }).start();
        }

    }

    private void change() {
        a = 3;
        b = a;
    }
    private void print() {
        System.out.println("b="+b+", a="+a);
    }

}
