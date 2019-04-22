package thread;

import java.util.ArrayList;
import java.util.concurrent.*;

class TaskWithResult implements Callable<String> {

    private int id;
    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        return "result of TaskWithresult" + id;
    }
}

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<Future<String>>();
        for(int i=0; i<10; i++) {
            results.add(executorService.submit(new TaskWithResult(i)));
        }
        for(Future<String> future: results) {
            try {
                boolean flag = future.isDone();
                System.out.println(flag+future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }finally {
                executorService.shutdown();
            }
        }
    }

}
