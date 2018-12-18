package gof23.abstractfactory;

public interface CarFactory {

    public Engine creatEngine();
    public Seat creatSeat();
    public Tyre creatTyre();
}

