package testJVM.loadclass;

/**
 * @ClassName CacheLinePadding
 * @Description 测试缓存行对齐的实验
 * @Author caoyue
 * @Date 2021/5/25 10:17 上午
 * @Version V1.0
 **/
public class CacheLinePadding {
    private static class Padding {
        public volatile long p1,p2,p3,p4,p5,p6,p7;
    }

    private static class T extends Padding {
        public volatile long x = 0L;
    }

    public static T [] arr = new T[2];

    static {
        arr[0] = new T();
        arr[1] = new T();
    }

    public static void main(String[] args) throws Exception{
        Thread t1 = new Thread(() -> {
            for(long i=0; i<1000_0000L; i++) {
                arr[0].x = i;
            }
        });
        Thread t2 = new Thread(() -> {
            for(long i=0; i<1000_0000L; i++) {
                arr[1].x = i;
            }
        });
        long start = System.currentTimeMillis();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
