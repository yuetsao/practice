package com.yuetsao.testJVM.gc;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName HelloGC
 * @Description 第一个out of memory error
 * @Author caoyue
 * @Date 2021/5/26 12:37 上午
 * @Version V1.0
 **/
public class HelloGC {
    public static void main(String[] args) {
        System.out.println("Hello GC");
        List list = new LinkedList<>();
        for(;;) {
            byte[] b = new byte[1024*1024];
            list.add(b);
        }
    }
}

