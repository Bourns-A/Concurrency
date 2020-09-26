package singleton;

public class singleton1 {
    //类装载就完成了实例化
    private final static singleton1 INSTANCE = new singleton1();
    private singleton1() {

    }

    public static singleton1 getInstance() {
        return INSTANCE;
    }
}
