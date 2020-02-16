package liuwei.singleton.eagerSingleton;

/**
 * @Title: EagerSingleton
 * @Description: 饿汉式单例模式
 * @author: caoyue
 * @date: 2020/2/16 16:08
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/16 16:08
 * @company: shopin.net
 * @version: V1.0
 */

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton() {}
    public static EagerSingleton getInstance() {
        return  instance;
    }
}
