package gof23.bridge;

class Laptop extends Computer2 {
    public Laptop(Brand brand) {
        super(brand);
    }
    @Override
    public void sale() {
        super.sale();
        System.out.println("销售笔记本");
    }
}
