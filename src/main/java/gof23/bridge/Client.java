package gof23.bridge;

public class Client {
    public static void main(String[] args){
        Computer2 computer2 = new Desktop(new Lenovo());
        computer2.sale();
    }


}
