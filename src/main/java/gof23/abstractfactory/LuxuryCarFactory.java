package gof23.abstractfactory;

public class LuxuryCarFactory implements CarFactory {
    @Override
    public LuxuryEngine creatEngine() {
        return new LuxuryEngine();
    }
    @Override
    public LuxurySeat creatSeat() {
        return new LuxurySeat();
    }

    @Override
    public LuxuryTyre creatTyre() {
        return new LuxuryTyre();
    }
}
