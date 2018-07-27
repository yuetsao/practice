
class Cup {
    Cup(int marker) {
        System.out.println("Cup------"+ marker);
    }
    void f(int marker) {
        System.out.println("f-----"+marker);
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup1 = new Cup(2);
    }
    Cups() {
        System.out.println("Cups--------");
    }

}
public class ExplicitStatic {
    public static void main(String [] args) {
        new Cups();
        System.out.println("inside main");
        Cups.cup1.f(99);
    }
}
