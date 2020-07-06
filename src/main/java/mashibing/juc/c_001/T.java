package mashibing.juc.c_001;
/**
 * @Title: T
 * @Description:  
 * @author: caoyue
 * @date: 2020/7/6 17:02
 * @最后修改人: caoyue
 * @最后修改时间: 2020/7/6 17:02
 * @company: shopin.net
 * @version: V1.0
 */

/**
 * @Auther: yuetsao
 * @Date: 2020/7/6 17:02
 * @Description:
 */
public class T implements Runnable {
    private volatile  int count = 100;
    
    @Override
    public synchronized void run() {
        synchronized (this){count --;}
        System.out.println(Thread.currentThread().getName() + "count "+ count);
    }
    public static void main(String[] args) {
                    T t = new T();       
        for(int i=0; i<10; i++) {
//            T t = new T();
            new Thread(t, "THREAD"+ i).start();
        }
    }
    
}
