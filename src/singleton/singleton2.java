package singleton;

public class singleton2 {
    //类装载就完成了实例化
    private final static singleton2 INSTANCE;

    static {
        INSTANCE = new singleton2();
    }

    private singleton2() {

    }

    public static singleton2 getInstance() {
        return INSTANCE;
    }
}
