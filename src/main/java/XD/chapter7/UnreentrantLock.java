package XD.chapter7;

public class UnreentrantLock {

    private boolean isLocked = false;

    public synchronized void lock() {

        System.out.println("进入lock枷锁" + Thread.currentThread().getName());

        while (isLocked) {
            System.out.println("进入wait等待" + Thread.currentThread().getName());
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isLocked = true;
    }

    public synchronized void unlock() {
        System.out.println("进入unlock解锁" + Thread.currentThread().getName());
        isLocked = false;
        notify();

    }
}
