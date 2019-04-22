package thinking;

class Mug {
    Mug(int marker) {
        System.out.println("thinking.Mug-----"+ marker);
    }
    void f(int marker) {
        System.out.println("f----"+ marker);
    }
}
public class Mugs {
    Mug mug1;
    Mug mug2;
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 and mug2 initialized");
    }
    Mugs() {
        System.out.println("thinking.Mugs");
    }
    Mugs(int i) {
        System.out.println("thinking.Mugs(int)");
    }
    public static void main(String args []) {
        System.out.println("inside main");
        new Mugs();
        System.out.println("new thinking.Mugs completed");
        new Mugs(1);
        System.out.println("new thinking.Mugs(1) completed");
    }
}
