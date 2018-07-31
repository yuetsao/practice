public class PrivateOverride {
//    private void f() {
//    public void f() {
//        System.out.println("private f()");
//    }
    public static void main(String [] args) {
        PrivateOverride po = new Derived();
        ((Derived)po).f();
    }
}

class Derived extends PrivateOverride {
    public void f() {
        System.out.println("public f()");
    }
}
