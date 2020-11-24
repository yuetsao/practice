package mashibing.juc;

import java.util.Random;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

/**
 * Copyright (C),上品折扣
 * FileName: PhaserTest
 *
 * @author caoyue
 * @date 2020 2020/11/22 00:10
 * description
 */
public class PhaserTest {
    static Random r = new Random(); 
    static MarriagePhaser phaser = new MarriagePhaser();

    static void millisSleep(int milli) {
        try {
            TimeUnit.MICROSECONDS.sleep(milli);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        phaser.bulkRegister(6);
        for (int i = 0; i < 4; i++) {
            new Thread(new Person("p" + i)).start();
        }
        new Thread(new Person("新郎")).start();
        new Thread(new Person("新娘")).start();
        
    }
    
    static class MarriagePhaser extends Phaser {
        @Override
        protected boolean onAdvance(int phase, int registeredParties) {
            switch (phase) {
                case 0:
                    System.out.println("所有人都到期了！" + registeredParties);
                    System.out.println();
                    return false;
                case 1:
                    System.out.println("所有人都吃完了！" + registeredParties);
                    System.out.println();
                    return false;
                case 2:
                    System.out.println("所有人都离开了！" + registeredParties);
                    System.out.println();
                    return false;
                case 3:
                    System.out.println("婚礼结束了了！新郎和新娘拥抱！"+ registeredParties);
                    return false;
                default:
                    return true;
            }
        }
    }
    
    static class Person implements Runnable {
        
        String name;

        public Person(String name) {
            this.name = name;
        }
        
        public void arrive() {
            millisSleep(r.nextInt(1000));
            System.out.printf("%s 到达现场！\n", name);
            phaser.arriveAndAwaitAdvance();
        }
        
        public void eat() {
            millisSleep(r.nextInt(1000));
            System.out.printf("%s 吃完\n", name);
            phaser.arriveAndAwaitAdvance();
            
        }
        
        public void leave() {
            millisSleep(r.nextInt(1000));
            System.out.printf("%s 离开\n", name);
            phaser.arriveAndAwaitAdvance(); 
        }
        
        public void hug() {
           if(name.equals("新郎") || name.equals("新娘")) {
               millisSleep(r.nextInt(1000));
               System.out.printf("%s 洞房 \n" , name);
               phaser.arriveAndAwaitAdvance();
           }else {
               phaser.arriveAndDeregister();
           } 
        }

        @Override
        public void run() {
           arrive();
           eat();
           leave();
           hug();
        }
    }
}
