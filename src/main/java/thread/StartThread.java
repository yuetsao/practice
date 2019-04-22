package thread;

public class StartThread extends Thread{
    /*
    * 1普通类集成Thread 重写run方法
    * 2调用start方法，start方法是和操作系统打交道的方法
    * 创建线程的时机很重要
    * 执行线程必须调用start方法，加入到调度器上，并不一定立即执行
    * */
    @Override
    public void run() {
        for(int i=0; i<200; i++) {
            System.out.println("一边听歌");
        }
    }

    public static void main(String[] args) {
        StartThread startThread = new StartThread();
        startThread.start();
        for (int i=0; i<200; i++) {
            System.out.println("一边编程");
        }
    }
}
