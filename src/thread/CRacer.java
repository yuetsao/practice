package thread;

import java.util.concurrent.*;

//龟兔赛跑
public class CRacer implements Callable<Integer> {
    private String winner;
    @Override
    public Integer call() throws Exception {
        for(int step=1; step<=100; step++) {
            if(Thread.currentThread().getName().equals("thread-01") && step%10==0) {
                Thread.sleep(1000);
            }
            System.out.println(Thread.currentThread().getName()+"--->");
            boolean isGameOver = gameOver(step);
            if(isGameOver) {
                return step;
            }
        }
        return null;
    }

    private boolean gameOver(int step) {
        if(winner!=null) {
            return true;
        }else {
            if(step==100) {
                System.out.println("winner"+Thread.currentThread().getName());

            }
        }
        return false;
    }

    public static void main(String[] args) {
        CRacer cRacer = new CRacer();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> result1 = executorService.submit(cRacer);
        Future<Integer> result2 = executorService.submit(cRacer);
        Integer r1 = 0;
        Integer r2 = 0;
        try {
            r1 = result1.get();
            r2 = result2.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(r1+"---"+r2);
        executorService.shutdownNow();

    }
}
