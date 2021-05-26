package com.yuetsao.testJVM.loadclass;

/**
 * @ClassName TestHalfInitializing
 * @Description 怎样解释半初始化？
 * 0 new #2 <com.yuetsao.testJVM/loadclass/Simple> //这时内存中已经有了
 * 3 dup
 * 4 invokespecial #3 <com.yuetsao.testJVM/loadclass/Simple.<init>>
 * 7 astore_1 //赋值给simple，这时候 4，7 有可能会发生指令重排序，这样就会使对象有可能处于半初始化状态
 * 8 return
 * @Author caoyue
 * @Date 2021/5/25 1:34 上午
 * @Version V1.0
 **/
public class TestHalfInitializing {
    public static void main(String[] args) {
        Simple simple = new Simple();
    }
}
