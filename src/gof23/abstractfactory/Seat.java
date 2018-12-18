package gof23.abstractfactory;

public interface Seat {
    public void massage();
}

class LuxurySeat implements Seat {

    @Override
    public void massage() {
        System.out.println("Can massage...");
    }
}

class LowSeat implements Seat {

    @Override
    public void massage() {
        System.out.println("Can't massage...");
    }
}
