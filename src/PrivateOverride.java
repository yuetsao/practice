public class PrivateOverride {
    private void f() {
//    public void f() {
        System.out.println("private f()");
    }
    public static void main(String [] args) {
        PrivateOverride po = new Derived();
        ((Derived)po).f(1);
    }
}

class Derived extends PrivateOverride {
    public void f(int i) {
        System.out.println("public f()");
    }
}
