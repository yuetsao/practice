package gof23.mediator;

public class Market implements Department {
    private Mediator mediator;

    public Market(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("market", this);
    }

    @Override
    public void selfAction() {
        System.out.println("承接项目 ");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作， 项目承接的需要资金支持 ");
        mediator.commond("finacial");
    }
}
