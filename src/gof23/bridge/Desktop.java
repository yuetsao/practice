package gof23.bridge;

class Desktop extends Computer2 {
    public Desktop(Brand brand) {
        super(brand);
    }
    @Override
    public void sale() {
        super.sale();
        System.out.println("销售台式机器");
    }
}
