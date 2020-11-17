package mashibing.juc;

import java.util.concurrent.TimeUnit;

/**
 * Copyright (C),上品折扣
 * FileName: TestExtendReentry
 *
 * @author caoyue
 * @date 2020 2020/11/17 04:02
 * description 测试父子继承时是否synchronized可重入
 */
public class TestExtendReentry {
    synchronized void m() {
        System.out.println("m start");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m end");
    }
    static class T extends TestExtendReentry {
        @Override
        synchronized void m() {
            System.out.println("child m start");
            super.m();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("child m end");
        }
    }

    public static void main(String[] args) {
        T t = new T();
        t.m();
    }
}
