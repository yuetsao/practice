package mashibing.juc;
/**
 * @Title: T2
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/7/23 14:45
 * @最后修改人: caoyue
 * @最后修改时间: 2020/7/23 14:45
 * @company: shopin.net
 * @version: V1.0
 */

import java.util.concurrent.TimeUnit;

/**
 * @Auther: yuetsao
 * @Date: 2020/7/23 14:45
 * @Description:
 */
public class T2 {
    int count = 0;
    synchronized void m() {
        System.out.println(Thread.currentThread().getName() + "start");
        while(true) {
            count ++;
            System.out.println(Thread.currentThread().getName() + "count=" + count);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(count % 5 == 0) {
                int i = 1/0;
                System.out.println(i);
            }
        }
    }
    
    public static void main(String[] args) {
        T2 t = new T2();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                t.m();
            }
        };
        new Thread(r, "t1").start();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(r, "t2").start();
    }
}
