package mashibing.juc;

import java.util.concurrent.TimeUnit;

/**
 * Copyright (C),上品折扣
 * FileName: TestReentry
 *
 * @author caoyue
 * @date 2020 2020/11/17 03:52
 * description 测试synchronized reentry
 */
public class TestReentry {
    
    public synchronized void  m1() {
        System.out.println("m1 start");
        try {
            TimeUnit.MICROSECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m2();
        System.out.println("m1 end");
    }
    public synchronized void m2() {
        System.out.println("m2 start");
        try {
            TimeUnit.MICROSECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m2 end");
    }

    public static void main(String[] args) {
        TestReentry testReentry = new TestReentry();
        testReentry.m1();
    }
}
