package com.yuetsao.demos.threadDemo;

/**
 * @ClassName TestThreadState
 * @Description
 * @Author caoyue
 * @Date 2021/5/27 9:48 上午
 * @Version V1.0
 **/
public class TestThreadState extends Thread{
    @Override
    public void run() {
        System.out.println(this.getState());

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new TestThreadState();
        System.out.println(t.getState());
        t.start();
        t.join();
        System.out.println(t.getState());
    }
}
