package gof23.strategy;

public class Client {
    public static void main(String[] args) {
        Strategy s1 = new OldCustemerManyStrategy();
        Context context = new Context(s1);
        context.printPrice(998);
    }
}
