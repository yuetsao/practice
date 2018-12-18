package gof23.abstractfactory;

public class LowCarFactory implements CarFactory{
    @Override
    public LowEngine creatEngine() {
        return new LowEngine();
    }

    @Override
    public LowSeat creatSeat() {
        return new LowSeat();
    }

    @Override
    public LowTyre creatTyre() {
        return new LowTyre();
    }
}
