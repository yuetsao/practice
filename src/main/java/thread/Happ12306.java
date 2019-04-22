package thread;

public class Happ12306 {
    public static void main(String[] args) {
        Web12306 c = new Web12306(4,"happy sxt");
        new  Passenger(c,"老高",2).start();
        new  Passenger(c,"老裴",1).start();
        new  Passenger(c,"老徐",3).start();
    }
}

class Passenger extends Thread {
    int seats;
    public Passenger(Runnable target, String name, int seats) {
        super(target, name);
        this.seats = seats;
    }
}

class Web12306 implements Runnable {
    int avaliable;
    String name;

    public Web12306 (int avaliable, String name) {
        this.avaliable = avaliable;
        this.name = name;
    }
    @Override
    public void run() {
        Passenger p = (Passenger)Thread.currentThread();
        boolean flag = bookTicket(p.seats);
        if(flag) {
            System.out.println("购票成功" + Thread.currentThread().getName() + p.seats);
        }else {
            System.out.println("购票失败" + Thread.currentThread().getName() + "位置不够");
        }

    }
    public synchronized boolean bookTicket (int seats) {
        System.out.println("当前可用的位置为" + avaliable);
        if(seats>avaliable) {
            return false;
        }
        avaliable -= seats;
        return true;
    }
}
