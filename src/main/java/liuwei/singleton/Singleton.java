package liuwei.singleton;

/**
 * @Title: Singleton
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/16 16:00
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/16 16:00
 * @company: shopin.net
 * @version: V1.0
 */

public class Singleton {
    //静态私有成员变量
    private static Singleton instance = null;
    //私有构造函数
    private Singleton(){}
    
    //静态共有工厂方法，返回唯一实例
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
