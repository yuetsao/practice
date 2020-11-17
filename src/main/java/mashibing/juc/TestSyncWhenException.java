package mashibing.juc;

import java.util.concurrent.TimeUnit;

/**
 * Copyright (C),上品折扣
 * FileName: TestSyncWhenException
 *
 * @author caoyue
 * @date 2020 2020/11/17 04:13
 * description
 */
public class TestSyncWhenException {
    Integer count = 0;
    synchronized void m1() {
        while (true) {
            count++;
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(count);
            if(count == 5) {
                int j = count/0;
            }
        }
    }

    public static void main(String[] args) {
        TestSyncWhenException t = new TestSyncWhenException();
        Runnable runnable = () -> {
            t.m1();
        };
        Thread thread1 = new Thread(runnable, "thread1");
        thread1.start();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread2 = new Thread(runnable, "thread2");
        thread2.start();
    }
}
