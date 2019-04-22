package gof23.strategy;

public class OldCustemerManyStrategy implements Strategy {

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("老用户，大批量");
        return 0.5*standardPrice;
    }
}
