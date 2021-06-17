package com.yuetsao.demos.threadDemo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * @ClassName HelloCreateThread
 * @Description 创建线程的几种方式
 * @Author caoyue
 * @Date 2021/5/27 9:26 上午
 * @Version V1.0
 **/
public class HelloCreateThread {
    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello Mythread!");
        }
    }

    static class MyRun implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello myRun!");
        }
    }

    static class MyCall implements Callable<String>{
        @Override
        public String call() throws Exception {
            System.out.println("Hello Mycall");
            return "success";
        }
    }

    public static void main(String[] args) {
        new MyThread().start();
        new Thread(new MyRun()).start();
        new Thread(() -> {
            System.out.println("Hello lambda");
        });

        //FutureTask + Callable  继承结构 ： FutureTask -> RunnableFuture -> Runnable , Future
        Thread t = new Thread(new FutureTask<String>(new MyCall()));
        t.start();
        // execute方法接收的也是一个 Runnable的 FunctionalInterface
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(() -> {
            System.out.println("Hello ThreadPool");
        });
        service.shutdown();
    }

}
