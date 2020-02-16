package liuwei.singleton.lazysingleton;

/**
 * @Title: LazySingleton
 * @Description: 双重检验锁 + 线程可见性变量 => 实现饿汉式
 * @author: caoyue
 * @date: 2020/2/16 16:19
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/16 16:19
 * @company: shopin.net
 * @version: V1.0
 */

public class LazySingleton {
    private volatile static LazySingleton instance = null;
    private LazySingleton(){}
    public static LazySingleton getInstance() {
        if(instance == null) {
            synchronized (LazySingleton.class) {
                if(instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return  instance;
    }
}
