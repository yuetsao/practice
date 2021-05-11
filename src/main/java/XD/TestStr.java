package XD;

public class TestStr {


    static String a = new String("caoyue");
    static String b = "caoyue";
    static String c = "caoyue";

    static final String s1 = "caoyue";
    static String s2 = s1 + ".net";//变量 + 常量 = 来自堆
    static String s3 = "caoyue" + ".net"; // 常量 + 常量 = 来自常量池

    public static void main(String[] args) {
        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println("=============");

        System.out.println(s2 == "caoyue.net");
        System.out.println(s3 == "caoyue.net");

    }

}
