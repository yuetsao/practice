package XD.chapter7;

public class ReentrantLock {

    private boolean isLocked = false;

    private Thread lockedOwner = null;

    private int lockedCount = 0;

    public synchronized void lock() throws InterruptedException{
        System.out.println("进入lock锁" + Thread.currentThread().getName());

        Thread thread = Thread.currentThread();

        while (isLocked && lockedOwner != thread) {
            System.out.println("进入wait等待" + Thread.currentThread().getName());
            System.out.println("当前锁的状态 isLocked =" + isLocked);
            System.out.println("当前count数量 lockedCount = " + lockedCount);
            wait();
        }
        isLocked = true;
        lockedOwner = thread;
        lockedCount ++;
    }

    public synchronized void unlock() {
        System.out.println("进入unlock解锁" +  Thread.currentThread().getName());

        Thread thread = Thread.currentThread();
        //线程A加的锁要由线程A解锁，其他线程不能解锁
        if(thread == this.lockedOwner) {
           lockedCount --;
           if(lockedCount == 0) {
               lockedOwner = null;
               isLocked = false;
               notify();
           }
        }
    }
}
