package thinking;

/**
 * Copyright (C),上品折扣
 * FileName: PassObject
 *
 * @author caoyue
 * @date 2020 2020/10/23 11:18
 * description
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class PassObject {
    static void f(Letter y) {
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        Letter y = new Letter();
        x = y;
        x.c = y.c;
        x.c = 'a';
        y.c = 'b';
        x.c = y.c;
        System.out.println("------------------");
        System.out.println(x.c);
        System.out.println(y.c);
        System.out.println(x.c);
        System.out.println("------------------");
        System.out.println("1:x.c:" + x.c);
        f(x);
        System.out.println("2:x.c:" + x.c);
    }
}
 
class Letter {
    char c;
}
