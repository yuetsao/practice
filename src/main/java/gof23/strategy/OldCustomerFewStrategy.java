package gof23.strategy;

public class OldCustomerFewStrategy implements Strategy {

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("老客户，小批量");
        return standardPrice*0.8;
    }
}
