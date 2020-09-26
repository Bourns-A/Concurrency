package singleton;


//懒汉式
public class singleton7 {
//    private volatile static singleton7 instance;
    private singleton7() {

    }

    private static class singletonInstance {
        private static final singleton7 INSTANCE = new singleton7();
    }

    public  static singleton7 getInstance() {

        return singletonInstance.INSTANCE;
    }

}
