package exceptions;

class MyExcpetion extends Exception {
    public MyExcpetion() {}
    public MyExcpetion(String msg ) {
        super(msg);
    }
}
public class FullConstructors {
    public static void f() throws MyExcpetion{
        System.out.println("Throwing MyException from f()");
        throw new MyExcpetion();
    }
    public static void g() throws MyExcpetion{
        System.out.println("Throwing MyException from g()");
        throw new MyExcpetion("in g()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyExcpetion excpetion) {
            excpetion.printStackTrace();
        }
        try {
            g();
        }catch (MyExcpetion excpetion) {
            excpetion.printStackTrace(System.out);
        }

    }
}
