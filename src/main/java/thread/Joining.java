package thread;

class Sleeper extends Thread{
    private int duration;
    public Sleeper(String name, int sleepTime) {
        super(name);
        duration = sleepTime;
        start();
    }

    @Override
    public void run() {
        try {
            sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + "has awakened");
    }
}

class Joiner extends Thread {
    private Sleeper sleeper;
    public Joiner(String name, Sleeper sleeper) {
        super(name);
        this.sleeper = sleeper;
        start();
    }
    @Override
    public void run() {
        try {
            sleeper.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() +"join has complete");
    }
}

public class Joining {
    public static void main(String[] args) {
        Sleeper sleeper = new Sleeper("chufangbo", 1500),
                grumpy = new Sleeper("xutianci", 1500);
        Joiner joiner = new Joiner("huihui", sleeper),
                doc = new Joiner("qingxuan", grumpy);
        grumpy.interrupt();
    }
}
