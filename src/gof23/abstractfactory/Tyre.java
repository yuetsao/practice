package gof23.abstractfactory;

public interface Tyre {
    public void revolve();
}

class LuxuryTyre implements Tyre {

    @Override
    public void revolve() {
        System.out.println("Revolve fast...");
    }
}

class LowTyre implements Tyre {

    @Override
    public void revolve() {
        System.out.println("Revolve slow...");
    }
}
