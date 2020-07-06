package mashibing.juc.c_000;
/**
 * @Title: CreateThread
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/7/6 15:29
 * @最后修改人: caoyue
 * @最后修改时间: 2020/7/6 15:29
 * @company: shopin.net
 * @version: V1.0
 */

/**
 * @Auther: yuetsao
 * @Date: 2020/7/6 15:29
 * @Description:
 */
public class CreateThread {
    static class Mythread extends Thread {
        @Override
        public void run() {
            System.out.println("Thread running!");
        }
    }
    
    static class MyRun implements Runnable {

        @Override
        public void run() {
            System.out.println("Run running!");
        }
    }

    public static void main(String[] args) {
        new Mythread().start();
        new Thread(new MyRun()).start();
        new Thread(()-> {
            System.out.println("Hello lambda!"); 
        }).start();
    }
    
}
