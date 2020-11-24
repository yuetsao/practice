package mashibing.juc;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

/**
 * Copyright (C),上品折扣
 * FileName: AtomicVsSyncVsLongAdder
 *
 * @author caoyue
 * @date 2020 2020/11/21 20:10
 * description
 */
public class AtomicVsSyncVsLongAdder {
    static long count2 = 0L;
    static AtomicLong count1 = new AtomicLong(0L);
    static LongAdder count3 = new LongAdder();

    public static void main(String[] args) throws Exception{
        Thread[] threads = new Thread[1000];
        for (int l = 0; l <threads.length; l++) {
            threads[l] = 
                new Thread(() -> {
                    for (int i = 0; i <100000 ; i++) {
                       count1.incrementAndGet(); 
                    }
                });        
        }
        long start = System.currentTimeMillis();
        for(Thread t: threads) {
            t.start();
        }
        for(Thread t: threads) {
            t.join();
        }
        long end = System.currentTimeMillis();
        System.out.println("Atomic:" + count1.get() + "time" + (end -start));
       
        Object lock = new Object();

        for (int l = 0; l < threads.length; l++) {
           threads[l] =
                   new Thread(new Runnable() {
                       @Override
                       public void run() {
                           for (int i = 0; i < 100000; i++) {
                              synchronized (lock) {
                                  count2 ++;
                              }
                           }
                       }
                   });
        }
        start = System.currentTimeMillis();
        for(Thread t: threads) {
            t.start();
        }
        for(Thread t: threads) {
            t.join();
        }
        end = System.currentTimeMillis();
        System.out.println("Sync: " + count2 + "time "+ (end-start));

        for (int i = 0; i < threads.length; i++) {
           threads[i] = 
                new Thread(() -> {
                    for (int j = 0; j < 100000; j++) {
                       count3.increment(); 
                    }
                });        
        } 
        start = System.currentTimeMillis();
        for(Thread t: threads) {
            t.start();
        }
        for(Thread t: threads) {
            t.join();
        }
        end = System.currentTimeMillis();
        System.out.println("longAdder" + count3.longValue() + "time " + (end-start));
    }
}
