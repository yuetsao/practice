
class Bowl {
    Bowl(int marker) {
        System.out.println("Bowl-----" + marker);
    }

    void  f1 (int marker) {
        System.out.println("f1-----" + marker);
    }
}

class Table {
    static Bowl bowl = new Bowl(1);
    Table() {
        System.out.println("Table()");
        bowl2.f1(1);
    }
    static void f2(int marker) {
        System.out.println("f2-----" + marker);
    }
    static Bowl bowl2 = new Bowl(2);

}

class Cupboard {
    //3.调用构造函数中的
    Bowl bowl3 = new Bowl(3);
    //1首先调用这个静态区域
    static Bowl bowl4 = new Bowl(4);
    Cupboard() {
        //4然后调用这个构造函数
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }
    static void f3 (int marker) {
        System.out.println("f3-----" + marker);
    }
    //2其次调用这个静态区域
    static Bowl bowl5 = new Bowl(5);

}


public class StaticInitializtion {
    public static void main(String [] args) {
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();
        System.out.println("Creating new Cupboard() in main-----------");
        new Cupboard();
        System.out.println("--------+++++----------");
        Table.f2(1);
        System.out.println("============+++++==========");
        Cupboard.f3(1);
    }
}
