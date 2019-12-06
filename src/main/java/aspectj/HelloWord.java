package aspectj;

/**
 * @author caoyue
 * @description 大概描述所属模块和介绍
 * @date 2019-10-24 11:04
 **/
public class HelloWord {
    public void sayHello() {
        System.out.println("hello world!");
    }

    public static void main(String[] args) {
        HelloWord helloWord = new HelloWord();
        helloWord.sayHello();
    }
}
