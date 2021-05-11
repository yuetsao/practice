package basic;

/**
 * 位运算符
 */
public class AndOR {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 12;
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toBinaryString(12));
        System.out.println(a & b);
        System.out.println(~a);
        System.out.println("-------------------");
        Integer c = 2;
        //将一个树左移n位相当于乘以2的n次方
        System.out.println(c<<3);
    }
}
