package threadcoreknowledge.UncaughtException;

import java.util.logging.Level;
import java.util.logging.Logger;


public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler{

    private String name;
    public MyUncaughtExceptionHandler(String name) {
        this.name = name;
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        Logger logger = Logger.getAnonymousLogger();
        logger.log(Level.WARNING, "Thread Exception, Terminated"+t.getName(), e);
        System.out.println(name+"got the exception"+t.getName()+e);
    }
}
