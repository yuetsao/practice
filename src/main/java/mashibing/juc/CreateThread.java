package mashibing.juc;

/**
 * Copyright (C),上品折扣
 * FileName: CreateThread
 *
 * @author caoyue
 * @date 2020 2020/11/15 17:24
 * description
 */
public class CreateThread implements Runnable {
    @Override
    public void run() {
        System.out.println("createThread");
    }

    static void testYield() {
        new Thread(
                () -> {
                    for (int i = 0; i < 100; i++) {
                        System.out.println("A----" + i);
                        if (i % 10 == 0) {
                            Thread.yield();
                        }
                    }
                }
        ).start();
        new Thread(
                () -> {
                    for (int i = 0; i < 100; i++) {
                        System.out.println("B----" + i);
                        if (i % 10 == 0) {
                            Thread.yield();
                        }
                    }
                }
        ).start();
    }

    static void testJoin() {
        Thread t1 = new Thread(
                () -> {
                    for (int i = 0; i < 100; i++) {
                        System.out.println("A" + i);
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                });

        Thread t2 = new Thread(
                () -> {
                    try {
                        t1.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    for(int i=0; i<100; i++) {
                        System.out.println("B" + i);
                        try {
                            Thread.sleep(500);
                        }catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
        );
        System.out.println("state");
        t1.start();
        t2.start();
        System.out.println(t1.getState());
        System.out.println(t2.getState());
    }

    public static void main(String[] args) {
//        CreateThread.testYield();
          CreateThread.testJoin();
//        new Thread(new CreateThread()).start();
//        new Thread(() -> System.out.println("hello lambda")).start();
    }
}
