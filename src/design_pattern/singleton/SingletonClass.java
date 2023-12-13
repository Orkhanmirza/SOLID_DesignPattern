package design_pattern.singleton;

public class SingletonClass {

    private static volatile SingletonClass singleton;

    private SingletonClass(){
    }

    public static  SingletonClass getInstance() {
        if (singleton == null) {
            synchronized (SingletonClass.class) {
                if (singleton == null) {
                    singleton = new SingletonClass();
                }
            }
        }
        return singleton;
    }
}
