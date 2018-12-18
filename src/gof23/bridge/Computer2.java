package gof23.bridge;

public abstract class Computer2 {
    protected Brand brand;

    public Computer2(Brand brand) {
        this.brand = brand;
    }
    public void sale() {
        brand.sale();
    }
}

