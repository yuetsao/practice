package thread;

public class LambdaThread {
    //静态内部类
    static class Test implements Runnable {
        @Override
        public void run () {
            for (int i = 0; i < 100; i++) {
                System.out.println("一边听歌");
            }
        }
    }
    public static void main(String[] args) {
        //局部内部类
        class Test2 implements Runnable {

            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("一边看电影");
                }
            }
        }
        //匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    System.out.println("一边写代码");
                }
            }
        }).start();
        //lambda表达式
        new Thread(()-> {for (int i = 0; i < 100; i++) {
            System.out.println("一边查百度");
        }}).start();
    }
}
