package gof23.Singleton;

/**
 * 静态内部类实现单例模式
 * 运行效率高
 * 懒加载
 * 线程安全
 */
public class InnerSingleton {
    private static class Singleton {
        private static final InnerSingleton instance = new InnerSingleton();
    }

    private InnerSingleton () {}

    private InnerSingleton getInstance() {
        return Singleton.instance;
    }
}
