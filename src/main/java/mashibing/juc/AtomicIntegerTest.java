package mashibing.juc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Copyright (C),上品折扣
 * FileName: AtomicIntegerTest
 *
 * @author caoyue
 * @date 2020 2020/11/21 18:43
 * description
 */
public class AtomicIntegerTest {
    AtomicInteger count = new AtomicInteger(0);
    
    void m() {
        count.incrementAndGet();
    }

    public static void main(String[] args) {
        AtomicIntegerTest t = new AtomicIntegerTest();
        List<Thread> threads = new ArrayList<>();
        
        for(int i=0; i<10; i++) {
            threads.add(new Thread(t::m, "thread"  + i));
        }
        threads.forEach((o) -> o.start());
        threads.forEach((o)-> {
            try {
                o.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(t.count);
    }
    
}
