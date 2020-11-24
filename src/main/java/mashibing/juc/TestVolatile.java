package mashibing.juc;

import java.util.concurrent.TimeUnit;

/**
 * Copyright (C),上品折扣
 * FileName: TestVolatile
 *
 * @author caoyue
 * @date 2020 2020/11/18 21:51
 * description  线程可见性测试
 */
public class TestVolatile {
    private volatile Boolean running = true;
    public void m() {
        System.out.println("m start");
        while (running) {
            
            
        }
        System.out.println("m end");
    }

    public static void main(String[] args) {
        TestVolatile t = new TestVolatile();
        new Thread(t::m, "t1").start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.running = false;
    }
}
