package basic;

public class SwapTwoInteger {


    public static void swap(int a, int b) {
        System.out.printf("a=%d, b=%d", a, b);
        a = a +b;
        b = a -b;
        a = a -b;
        System.out.printf("\na=%d, b=%d", a,b);
    }

    /**
     * 一个数与另外一个数异或两次是它本身
     * @param a
     * @param b
     */
    public static void swap2(int a, int b) {
        System.out.printf("a=%d, b=%d", a, b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.printf("\na=%d, b=%d", a,b);
    }



    public static void main(String[] args) {
        int a = -9;
        int b = 8;
        swap2(a, b);
    }
}
