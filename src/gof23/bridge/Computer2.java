package gof23.bridge;

public abstract class Computer2 {
    protected Brand brand;

    public Computer2(Brand brand) {
        this.brand = brand;
        try {
            Object obj;
            super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
    public void sale() {
        brand.sale();
    }


}

