package com.yuetsao.designpattern.singleton;

/**
 * @ClassName Test
 * @Description
 * @Author caoyue
 * @Date 2021/6/6 2:01 下午
 * @Version V1.0
 **/
public class Test {
    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.INSTANCE;
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        System.out.println(instance == instance1);
    }
}
