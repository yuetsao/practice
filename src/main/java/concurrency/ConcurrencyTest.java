package concurrency;

/**
 * @author caoyue
 * @description 大概描述所属模块和介绍
 * @date 2019-08-04 22:46
 **/
public class ConcurrencyTest {
    private static final long count = 10000001;

    public static void main(String [] args) throws InterruptedException {
        concurrency();
        serial();
    }

    private static void concurrency() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 0;
                for(long i=0; i<count; i++) {
                    a += 5;
                }
            }
        });
        thread.start();
        int b = 0;
        for(long i=0; i<count; i++) {
            b --;
        }
        thread.join();
        long time = System.currentTimeMillis() - start;
        System.out.println("concurency:" + time + "ms, b=" + b);
    }

    private static void serial() {
        long start = System.currentTimeMillis();
        int a = 0;
        for(long i=0; i<count; i++) {
            a += 5;
        }
        int b= 0;
        for(long i = 0; i < count; i++) {
            b--;
        }
        long time = System.currentTimeMillis() - start;
        System.out.println("serial:" + time +"ms, b=" + b + ",a="+ a);
    }
}
