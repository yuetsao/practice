package com.yuetsao.designpattern.singleton;

/**
 * @ClassName LazySingleton
 * @Description 带有双重检测的懒汉式单例模式
 * @Author caoyue
 * @Date 2021/6/6 11:13 上午
 * @Version V1.0
 **/
public class LazySingleton {
    /**
     * jit,cpu 有可能进行指令重排
     */
    private volatile static LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if(instance == null) {
            synchronized (LazySingleton.class) {
                if(instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
