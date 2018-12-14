package thread;

public class UncaughtExeceptionTest {
    public static void main(String[] args) {
        Thread.UncaughtExceptionHandler handler = new Thread.UncaughtExceptionHandler() {
            public void uncaughtException (Thread th, Throwable ex) {
                System.out.println("uncaught exception is" + ex);
            }
        };
        //这里属于匿名内部类的实现
        Thread t = new Thread() {
            public void run() {
                System.out.println("Sleeping ...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Interrupted.");
                }
                System.out.println("Throwing exception ...");
                throw new RuntimeException();
            }
        };
        t.setUncaughtExceptionHandler(handler);
        t.start();
    }



}
