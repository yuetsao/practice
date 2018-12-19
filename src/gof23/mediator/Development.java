package gof23.mediator;

public class Development implements Department {

    private Mediator mediator;//持有中介者

    public Development(Mediator mediator) {
        super();
        this.mediator = mediator;
        mediator.register("devolopment", this);
    }


    @Override
    public void selfAction() {
        System.out.println("专心科研，研发项目");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作没钱了，资金支持");
    }
}
