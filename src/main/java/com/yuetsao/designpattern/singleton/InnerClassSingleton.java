package com.yuetsao.designpattern.singleton;

/**
 * @ClassName InnerClassSingleton
 * @Description 本质上是利用类的加载机制来保证线程安全
 * 只有实际使用的时候，才会触发类的初始化，所以也是懒加载的一种形式。
 * @Author caoyue
 * @Date 2021/6/6 11:25 上午
 * @Version V1.0
 **/
public class InnerClassSingleton {

    private InnerClassSingleton() {}

    private static class InnerClassHolder {
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return InnerClassHolder.instance;
    }
}
