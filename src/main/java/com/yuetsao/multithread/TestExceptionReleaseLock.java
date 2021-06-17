package com.yuetsao.multithread;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName TestExceptionReleaseLock
 * @Description
 * @Author caoyue
 * @Date 2021/6/1 8:44 下午
 * @Version V1.0
 **/
public class TestExceptionReleaseLock {
    int i = 0;
    public static void main(String[] args) {
        TestExceptionReleaseLock t = new TestExceptionReleaseLock();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                t.m();
            }
        };
        new Thread(r, "t1").start();
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(r, "t2").start();
    }

    public synchronized void  m () {
        System.out.println(Thread.currentThread().getName() + i);
        while (true){
            if(i%5==0) {
                int a = i/0;
            }else {
                i ++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
