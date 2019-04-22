package gof23.strategy;

public class NewCustomerManyStrategy implements Strategy {

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("新客户大批量");
        return standardPrice*0.9;
    }
}
