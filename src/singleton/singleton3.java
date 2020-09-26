package singleton;


//懒汉式
public class singleton3 {
    private static singleton3 instance;
    private singleton3() {

    }

    public static singleton3 getInstance() {
        if (instance==null) {
            instance = new singleton3();
        }
        return instance;
    }

}
