package mashibing.juc.c_000;
/**
 * @Title: ThreadState
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/7/6 16:54
 * @最后修改人: caoyue
 * @最后修改时间: 2020/7/6 16:54
 * @company: shopin.net
 * @version: V1.0
 */

/**
 * @Auther: yuetsao
 * @Date: 2020/7/6 16:54
 * @Description:
 */
public class ThreadState extends Thread{
    public static void main(String[] args) throws InterruptedException {
       Thread t = new ThreadState();

        System.out.println(t.getState());
        
        t.start();
        
        t.join();
        System.out.println(t.getState());
    }
    @Override
    public void run() {
        System.out.println(this.getState());
        
        for(int i=0; i<100; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
    
}
