package mashibing.juc;

/**
 * Copyright (C),上品折扣
 * FileName: Mgr03
 *
 * @author caoyue
 * @date 2020 2020/11/20 14:32
 * description
 */
public class Mgr03 {
    private static Mgr03 INSTANCE;
    
    private Mgr03() {
        
    }
    
    public static Mgr03 getInstance() {
       if(INSTANCE == null) {
           try {
               Thread.sleep(1);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           INSTANCE = new Mgr03();
       }
       return INSTANCE;
    }
    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            new Thread(() -> System.out.println(Mgr03.getInstance().hashCode())).start();
        }
    }
}
