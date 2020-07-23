package mashibing.juc;
/**
 * @Title: HelloVolatile
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/7/23 16:04
 * @最后修改人: caoyue
 * @最后修改时间: 2020/7/23 16:04
 * @company: shopin.net
 * @version: V1.0
 */

import java.util.concurrent.TimeUnit;

/**
 * @Auther: yuetsao
 * @Date: 2020/7/23 16:04
 * @Description:
 */
public class HelloVolatile {
     boolean running = true; //对比一下有无volatile的情况下，整个程序运行结果的区别
    void m() {
        System.out.println("m start");
        while(running) {
            //System.out.println("run。。。。");
        }
        System.out.println("m end!");
    }

    public static void main(String[] args) {
        HelloVolatile t = new HelloVolatile();

        new Thread(t::m, "t1").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t.running = false;
    }

}
