package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Count {
    private int count=0;
    private Random random = new Random(47);
    public  synchronized int increament () {
        int temp = count;
        if(random.nextBoolean()) {
            Thread.yield();
        }
        return (count+=temp);
    }
    public synchronized int value() {
        return count;
    }
}

class Entrance implements Runnable {
    private static Count count = new Count();
    private static List<Entrance> entrances = new ArrayList<Entrance>();
    private int number = 0;

    @Override
    public void run() {

    }
}

public class OrnamentalGarden {


    public static void main(String[] args) {

    }
}
