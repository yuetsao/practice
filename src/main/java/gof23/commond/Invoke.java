package gof23.commond;

public class Invoke {
    private Commond commond;


    public Invoke(Commond commond) {
        this.commond = commond;
    }

    //用于调用命令的方法
    public void call() {
        commond.execute();
    }
}
