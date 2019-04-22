package thread;

public class TestThreadLocal {
    public static void main(String[] args) {
        testThreadLocal();
    }

    public static void testThreadLocal () {
        Thread thread = new Thread() {
            ThreadLocal<String> threadLocal = new ThreadLocal<>();

            @Override
            public void run () {
                threadLocal.set("www.baidu.com");
                System.out.println(threadLocal.get());
            }
        };
        thread.start();
    }

}
