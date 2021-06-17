package com.yuetsao.demos.threadDemo;

import javax.swing.*;

/**
 * @ClassName Test_Sleep_yield_join
 * @Description
 * @Author caoyue
 * @Date 2021/5/27 9:36 上午
 * @Version V1.0
 **/
public class Test_Sleep_yield_join {
    public static void main(String[] args) {
//        testSleep();
//        testYield();
        testJoin();
    }

    static void testSleep() {
        new Thread(() -> {
            for (int i = 0; i <100 ; i++) {
                System.out.println("A"+ i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    static void testYield () {
        new Thread(() -> {
            for (int i = 0; i <100 ; i++) {
                System.out.println("A"+ i);
                if(i%10==0) Thread.yield();
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i <100 ; i++) {
                System.out.println("----B"+ i);
                if(i%10==0) Thread.yield();
            }
        }).start();
    }

    static void testJoin() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <100 ; i++) {
                System.out.println("A"+ i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 100; i++) {
                System.out.println("B"+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
    }
}
