package gof23.Singleton;

/**
 * 测试恶汉式的单例模式
 */
public class Singleton {
    //类初始化时， 立即加载这个对象
    //天然的线程安全的形式
    //这种没有延迟加载的机制
    private static Singleton instance = new Singleton();
    private Singleton() {}
    //方法没有同步调用效率高
    public static Singleton getInstance() {
        return instance;
    }
}
