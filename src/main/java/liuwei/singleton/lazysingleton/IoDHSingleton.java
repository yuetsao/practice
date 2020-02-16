package liuwei.singleton.lazysingleton;

/**
 * @Title: IoDHSingleton
 * @Description: 使用静态内部类的方式实现饿汉式
 * @author: caoyue
 * @date: 2020/2/16 16:26
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/16 16:26
 * @company: shopin.net
 * @version: V1.0
 */

public class IoDHSingleton {
    private IoDHSingleton() {}
    private static class HolderClass {
        private final static IoDHSingleton instance = new IoDHSingleton();
    }
    
    public static IoDHSingleton getInstance() {
        return HolderClass.instance;
    }
}
