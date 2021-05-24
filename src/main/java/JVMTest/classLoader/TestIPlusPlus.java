package JVMTest.classLoader;

public class TestIPlusPlus {
    public static void main(String[] args) {
        int i = 8;
//        i = i++;
        i = ++i;
        System.out.println(i);
    }
}
