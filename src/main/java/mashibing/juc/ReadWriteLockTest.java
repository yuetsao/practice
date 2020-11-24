package mashibing.juc;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Copyright (C),上品折扣
 * FileName: ReadWriteLockTest
 *
 * @author caoyue
 * @date 2020 2020/11/22 12:47
 * description
 */
public class ReadWriteLockTest {
    static Lock lock = new ReentrantLock();
    private static int value;
    
    static ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    static Lock readLock = readWriteLock.readLock();
    static Lock writeLock = readWriteLock.writeLock();
    
    public static void read(Lock lock){
        lock.lock();
        try {
            Thread.sleep(1000);
            System.out.println("read over!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    } 
    public static void write(Lock lock, int v) {
        lock.lock();
        try {
            Thread.sleep(1000);
            value = v;
            System.out.println("write over");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Runnable readR = () -> read(readLock);
        Runnable writeR = () -> write(writeLock, new Random().nextInt());
        for (int l = 0; l < 18; l++) {
            new Thread(readR).start();
            new Thread(writeR).start();
            
        }
    }
}
