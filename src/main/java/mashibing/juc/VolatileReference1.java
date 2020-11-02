package mashibing.juc;
/**
 * @Title: VolatileReference1
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/7/23 16:14
 * @最后修改人: caoyue
 * @最后修改时间: 2020/7/23 16:14
 * @company: shopin.net
 * @version: V1.0
 */

import java.util.concurrent.TimeUnit;

/**
 * @Auther: yuetsao
 * @Date: 2020/7/23 16:14
 * @Description:
 */
public class VolatileReference1 {
    boolean running = true;

    volatile static  VolatileReference1 T= new VolatileReference1();


    void m() {
        System.out.println("m start");
        while(running) {
			/*
			try {
				TimeUnit.MILLISECONDS.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
        }
        System.out.println("m end!");
    }

    public static void main(String[] args) {
        new Thread(T::m, "t1").start();

        //lambda表达式 new Thread(new Runnable( run() {m()}

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        T.running = false;
    }
}
