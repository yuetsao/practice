package gof23;

public class DSingleton {
    private volatile static DSingleton dSingleton;
    private DSingleton () {}

    private static DSingleton getInstance () {
        if(dSingleton==null) {
            synchronized (DSingleton.class) {
                if(dSingleton == null) {
                    dSingleton = new DSingleton();
                }
            }
        }
        return dSingleton;
    }

}
