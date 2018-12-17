package gof23;

public class LazySingleton {
    private static LazySingleton s;
    private LazySingleton () {};
    public static synchronized LazySingleton getInstance() {
        if(s==null) {
            s = new LazySingleton();
        }
        return s;
    }
}
