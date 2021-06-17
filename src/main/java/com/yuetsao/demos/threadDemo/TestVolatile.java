package com.yuetsao.demos.threadDemo;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName TestVolatile
 * @Description
 * @Author caoyue
 * @Date 2021/5/27 10:03 上午
 * @Version V1.0
 **/
public class TestVolatile {
    volatile boolean  running = true;

    void m () {
        System.out.println("m start");
        while (running) {

        }
        System.out.println("m end");
    }

    public static void main(String[] args) throws InterruptedException {
        TestVolatile t = new TestVolatile();
        new Thread(t::m, "t1").start();

        TimeUnit.SECONDS.sleep(1);
        t.running = false;
    }
}
