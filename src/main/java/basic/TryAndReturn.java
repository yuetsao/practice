package basic;

public class TryAndReturn {

    public static void main(String[] args) {
        System.out.println(test1());
    }

    /**
     * 在执行try，catch中的return之前一定会执行finally中的代码（如果finally存在），如果
     * finally中有return语句，就会直接执行finally中的return方法，所以finally中的return语句一定会被执行的
     * 执行流程：finally执行前的代码里面包含return，则会先确定return返回值，然后执行finally的代码，最后再执行return
     * @return
     */
    public static int test1() {
        int a = 1;
        try {
            System.out.println(a/0);
            a = 2;
        } catch (ArithmeticException e) {
            a = 3;
            return a;
        } finally {
            a = 4;
//            return a;
        }
        return a;
    }
}
