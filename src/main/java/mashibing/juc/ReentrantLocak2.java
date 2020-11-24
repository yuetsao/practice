package mashibing.juc;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Copyright (C),上品折扣
 * FileName: ReentrantLocak2
 *
 * @author caoyue
 * @date 2020 2020/11/21 23:02
 * description
 */
public class ReentrantLocak2 {
    Lock lock = new ReentrantLock();
    void m1() {
        lock.lock();
        try {
            for (int i = 0; i < 10; i++) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(i);
                if(i==2) {
                    m2();
                }
            } 
        } catch (InterruptedException e) {
           e.printStackTrace(); 
        } finally {
            lock.unlock();
        }
    }
    
    void m2() {
        lock.lock();
        try {
            System.out.println("m2....."); 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        
    }

    public static void main(String[] args) {
        ReentrantLocak2 reentrantLocak2 = new ReentrantLocak2();
        new Thread(reentrantLocak2::m1).start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        new Thread(reentrantLocak2::m2).start();
    }
}
