package com.yuetsao.designpattern.singleton;

/**
 * @ClassName HungrySingleton
 * @Description
 * @Author caoyue
 * @Date 2021/6/6 11:23 上午
 * @Version V1.0
 **/
public class HungrySingleton {
    private static  HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return instance;
    }
}
