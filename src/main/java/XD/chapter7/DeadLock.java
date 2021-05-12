package XD.chapter7;

import net.sf.json.util.JSONUtils;

public class DeadLock {

    private static String locka = "locka";
    private static String lockb = "lockb";

    public void methodA() {
        synchronized (locka) {
            System.out.println("我是A方法中获得了锁A" + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lockb) {
                System.out.println("我是A方法获取了锁B" + Thread.currentThread().getName());
            }
        }
    }

    public void methodB() {
        synchronized (lockb) {
            System.out.println("我是B方法中获得了锁B" + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (locka) {
                System.out.println("我是B方法获取了锁A" + Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("主线程开始运行");
        DeadLock deadLock = new DeadLock();
        new Thread(() -> {
            deadLock.methodA();
        }).start();
        new Thread(() -> {
            deadLock.methodB();
        }).start();
        System.out.println("主线程运行结束" + Thread.currentThread().getName());
    }
}
