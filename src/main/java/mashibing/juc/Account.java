package mashibing.juc;
/**
 * @Title: Account
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/7/23 14:08
 * @最后修改人: caoyue
 * @最后修改时间: 2020/7/23 14:08
 * @company: shopin.net
 * @version: V1.0
 */

import java.util.concurrent.TimeUnit;

/**
 * @Auther: yuetsao
 * @Date: 2020/7/23 14:08
 * @Description:
 */
public class Account {
    String name;
    double balance;
    
    public synchronized void set(String name, double balance) {
        this.name = name;
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        this.balance = balance;
    }
    
    public synchronized double getBalance(String name) {
        return this.balance;
    }
    
    public static void main(String[] args) {
        Account a = new Account();
        new Thread(()->a.set("zhangsan", 100.0)).start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(a.getBalance("zhangsan"));

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(a.getBalance("zhangsan"));
        
    }
}
