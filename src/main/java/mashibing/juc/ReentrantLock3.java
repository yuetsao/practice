package mashibing.juc;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Copyright (C),上品折扣
 * FileName: ReentrantLock3
 *
 * @author caoyue
 * @date 2020 2020/11/21 23:12
 * description
 */
public class ReentrantLock3 {
    Lock lock = new ReentrantLock();
    void m1 () {
        lock.lock();
        try {
            for (int i = 0; i < 3; i++) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    void m2() {
        boolean locked = false;
        
        try {
            locked = lock.tryLock(5, TimeUnit.SECONDS);
            System.out.println("m2...." + locked);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if(locked) {
                lock.unlock();
            }
        }
        
    }

    public static void main(String[] args) {
        ReentrantLock3 r = new ReentrantLock3();
        new Thread(r::m1).start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(r::m2).start();
    }
}
