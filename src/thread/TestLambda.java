package thread;

import java.util.Arrays;

public class TestLambda {
    /*
    函数式接口就是只有一个方法的接口
    像这样的接口可以被隐式转换成lambda表达式
    java.lang.Runable接口 和 java.util.Callable 是函数式接口中最典型的两个例子
    函数式接口是最容易出错的，如果有人在函数式接口中增加一个方法 这个接口就不是函数式的了
    并且变异的过程也会失败
    为了避免这种错误，java8中增加了一种新的注解：@FunctionalInterface
    需要记住的一件事是：默认方法与静态方法并不影响函数式接口的契约，可以任意使用
    * */
    public static void main(String[] args) {
        Arrays.asList("a", "b", "c", "d").forEach(e-> System.out.println(e));
        Arrays.asList("a", "b", "c", "d").forEach(e-> {
            System.out.println(e);
            System.out.println(e);
        });
        Arrays.asList("a", "b", "c", "d").sort((e1, e2) -> e1.compareTo(e2));
        Arrays.asList("a", "b", "c", "d").sort((e1, e2) -> {
            int result = e1.compareTo(e2);
            return result;
        });
    }
}
