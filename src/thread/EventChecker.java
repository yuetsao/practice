package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EventChecker implements Runnable {
    private IntGenerator intGenerator;
    private final int id;

    public EventChecker(IntGenerator intGenerator, int ident) {
        this.intGenerator = intGenerator;
        id = ident;
    }

    public static void main(String[] args) {

    }
    @Override
    public void run() {
        while (!intGenerator.isCanceled()) {
            int val = intGenerator.next();
            if(val%2!=0) {
                System.out.println(val + "not even!");
                intGenerator.cancel();
            }
        }
    }
    public static void test(IntGenerator intGenerator, int count) {
        System.out.println("Press control-c to exit");
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i <count ; i++) {
            executorService.execute(new EventChecker(intGenerator, count));
        }
        executorService.shutdown();
    }
    public static void test(IntGenerator intGenerator) {
        test(intGenerator, 10);
    }
}
