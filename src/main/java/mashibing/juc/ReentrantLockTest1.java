package mashibing.juc;

import java.util.concurrent.TimeUnit;

/**
 * Copyright (C),上品折扣
 * FileName: ReentrantLockTest1
 *
 * @author caoyue
 * @date 2020 2020/11/21 22:57
 * description
 */
public class ReentrantLockTest1 {
    synchronized void m1 () {
        for (int i = 0; i < 10; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
            if(i==2) m2();
            
        }
    }
    
    synchronized  void m2() {
        System.out.println("m2...."); 
    }

    public static void main(String[] args) {
        ReentrantLockTest1 reentrantLockTest1 = new ReentrantLockTest1();
        new Thread(reentrantLockTest1::m1).start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
