package singleton;


//懒汉式
public class singleton4 {
    private static singleton4 instance;
    private singleton4() {

    }

    public synchronized static singleton4 getInstance() {
        if (instance==null) {
            instance = new singleton4();
        }
        return instance;
    }

}
