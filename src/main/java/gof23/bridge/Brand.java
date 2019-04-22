package gof23.bridge;

public interface Brand {
    void sale();
}

class Lenovo implements Brand {

    @Override
    public void sale() {
        System.out.println("联想品牌");
    }
}

class Dell implements Brand {

    @Override
    public void sale() {
        System.out.println("Dell品牌");
    }
}
