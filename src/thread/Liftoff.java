package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Liftoff implements Runnable {
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public void Listoff(int countDown) {
        this.countDown = countDown;
    }

    public String status () {
        return "#" + id + "(" + (countDown>0?countDown:"liftOff") + ")";
    }
    @Override
    public void run() {
        while (countDown-->0) {
            System.out.println(status());
            Thread.yield();
        }
    }
    public static void main(String[] args) {
//        ExecutorService exec = Executors.newCachedThreadPool();
        ExecutorService exec = Executors.newFixedThreadPool(5);//固定线程的个数
        for (int i = 0; i < 5; i++)
            exec.execute(new Liftoff());
        exec.shutdown();
    }


}
