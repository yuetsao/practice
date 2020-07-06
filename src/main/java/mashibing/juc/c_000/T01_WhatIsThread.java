package mashibing.juc.c_000;
/**
 * @Title: T01_WhatIsThread
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/7/4 23:31
 * @最后修改人: caoyue
 * @最后修改时间: 2020/7/4 23:31
 * @company: shopin.net
 * @version: V1.0
 */

import java.util.concurrent.TimeUnit;

/**
 * @Auther: yuetsao
 * @Date: 2020/7/4 23:31
 * @Description:
 */
public class T01_WhatIsThread {
    public static class T1 extends Thread {
        @Override
        public void run() {
          for (int i=0; i<10; i++) {
              try {
                  TimeUnit.MICROSECONDS.sleep(1);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
              System.out.println("T1");
          }
        }
    }

    public static void main(String[] args) {
//        new T1().run();
        new T1().start();
        for (int i=0; i<10; i++) {
            try {
                TimeUnit.MICROSECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("main");
        }
    }
}

