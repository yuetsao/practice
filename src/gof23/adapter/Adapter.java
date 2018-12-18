package gof23.adapter;

public class Adapter extends Adaptee implements Target {
    @Override
    public void handlerReq() {
        super.request();
    }

    //通过组合的方式，构造器传值
//    private Adapter adapter;
//
//    public Adapter(Adapter adapter) {
//        this.adapter = adapter;
//    }
//
//    @Override
//    public void handlerReq() {
//        adapter.request();
//    }
}
