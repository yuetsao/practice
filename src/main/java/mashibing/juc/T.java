package mashibing.juc;
/**
 * @Title: T
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/7/23 14:25
 * @最后修改人: caoyue
 * @最后修改时间: 2020/7/23 14:25
 * @company: shopin.net
 * @version: V1.0
 */

import java.util.concurrent.TimeUnit;

/**
 * @Auther: yuetsao
 * @Date: 2020/7/23 14:25
 * @Description:
 */
public class T {
    synchronized void m1() {
        System.out.println("m1 start");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();    
        }
        m2();
        System.out.println("m1 end");
    }
    
    synchronized void m2() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m2");
    }

    public static void main(String[] args) {
        new T().m1();
    }
}
