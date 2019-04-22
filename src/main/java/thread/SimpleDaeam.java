package thread;

import java.util.concurrent.TimeUnit;

public class SimpleDaeam implements Runnable {


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread daeman = new Thread(new SimpleDaeam());
            daeman.setDaemon(true);
            daeman.start();
        }
        System.out.println("All daemon started");
        try {
            TimeUnit.MICROSECONDS.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                TimeUnit.MICROSECONDS.sleep(0);
                System.out.println(Thread.currentThread().getName() + this);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
