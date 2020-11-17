package mashibing.juc;

import java.util.concurrent.TimeUnit;

/**
 * Copyright (C),上品折扣
 * FileName: RunAndStart
 *
 * @author caoyue
 * @date 2020 2020/11/15 17:14
 * description
 */
public class RunAndStart extends Thread {
    @Override
    public void run() {
        for(int i=0; i<10; i++) {
           try {
               TimeUnit.MICROSECONDS.sleep(1);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
            System.out.println("RunAndStart");
        }
    }

    public static void main(String[] args) {
//        new RunAndStart().run();
        new RunAndStart().start();
        for(int i=0; i<10; i++) {
            try {
                TimeUnit.MICROSECONDS.sleep(1);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("main");
        }
    }
}
