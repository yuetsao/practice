package gof23.strategy;

public class NewCustomerFewStrategy implements Strategy {

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("原价，不打折");
        return standardPrice;
    }
}
