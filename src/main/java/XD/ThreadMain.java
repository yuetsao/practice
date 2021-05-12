package XD;

import mashibing.juc.T;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class ThreadMain {



    public static void main(String[] args) {
        FutureTask<Object> futureTask = new FutureTask<Object>(new ThreadDemo1());
        Thread future = new Thread(futureTask);
        future.start();

        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        ExecutorService service = Executors.newFixedThreadPool(3);
        service.execute(() -> {
            System.out.println("executor");
        });
        service.shutdown();
    }

}
