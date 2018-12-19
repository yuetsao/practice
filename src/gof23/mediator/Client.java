package gof23.mediator;

public class Client {
    public static void main(String[] args) {

        Mediator mediator = new President();
        Market market = new Market(mediator);
        Development development = new Development(mediator);
        Finacial finacial = new Finacial(mediator);

        market.selfAction();
        market.outAction();
    }
}
