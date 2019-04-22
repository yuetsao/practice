package gof23.abstractfactory;

public interface Engine {
    public void start();
    public void run();
}

class LuxuryEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Start fast...");
    }

    @Override
    public void run() {
        System.out.println("Running fast...");
    }
}

class LowEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Start slowly...");
    }

    @Override
    public void run() {
        System.out.println("Running slowly...");
    }
}
