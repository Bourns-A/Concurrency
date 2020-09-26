package singleton;


//懒汉式
public class singleton6 {
    private volatile static singleton6 instance;
    private singleton6() {

    }

    public  static singleton6 getInstance() {
        if (instance==null) {
            synchronized (singleton6.class) {
                if (instance==null) {
                    instance = new singleton6();
                }
            }
        }
        return instance;
    }

}
