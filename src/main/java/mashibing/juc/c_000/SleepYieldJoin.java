package mashibing.juc.c_000;
/**
 * @Title: SleepYieldJoin
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/7/6 15:46
 * @最后修改人: caoyue
 * @最后修改时间: 2020/7/6 15:46
 * @company: shopin.net
 * @version: V1.0
 */

import java.util.concurrent.TimeUnit;

/**
 * @Auther: yuetsao
 * @Date: 2020/7/6 15:46
 * @Description:
 */
public class SleepYieldJoin {
    public static void main(String[] args) {
//       testSleep();
//       testYield();
       testJoin();
    }
    
    static void testSleep() {
        new Thread(()->{
          for(int i=0; i<100; i++) {
              System.out.println("A"+ i);
              try {
                  TimeUnit.MICROSECONDS.sleep(500);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
        }).start();
    }
    
    static void testYield() {
       new Thread(()->{
           for(int i=0; i<100; i++) {
               System.out.println("A"+i);
               if(i%10==0)
                   Thread.yield();
           }
       }).start();
       new Thread(()->{
           for(int i=0; i<100; i++) {
               System.out.println("B"+i);
               if(i%10==0)
                   Thread.yield();
           }
       }).start();
    }
    
    static void testJoin() {
       Thread t1 = new Thread(()->{
         for(int i=0; i<100; i++) {
             System.out.println("A"+i);
             try {
                 TimeUnit.MILLISECONDS.sleep(500);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }   
       });
       Thread t2 = new Thread(()->{
           try {
               t1.join();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           for(int i=0;i<100; i++) {
               System.out.println("B"+i);
               try {
                   TimeUnit.MILLISECONDS.sleep(500);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       });
       t1.start();
       t2.start();
    }
}
