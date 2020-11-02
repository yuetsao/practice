package thinking;

/**
 * Copyright (C),上品折扣
 * FileName: URShift
 *
 * @author caoyue
 * @date 2020 2020/10/25 23:24
 * description
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class URShift {
    public static void main(String[] args) {
//        int i = -1;
//        System.out.println(Integer.toBinaryString(i));
//        int j = 1;
//        System.out.println(Integer.toBinaryString(j));
//        i>>>=10;
//        System.out.println(Integer.toBinaryString(i));
//        j<<=2;
//        System.out.println(j);
        Integer j = 29;
        System.out.println(Integer.toBinaryString(j));
        j >>=3;
        System.out.println(Integer.toBinaryString(j));
        System.out.println(j);

        System.out.println("----------------1----------------");
        int i = -1;
        System.out.println("Before<<,i's value is" + i);
        System.out.println("i's binary string is " + Integer.toBinaryString(i));
        i<<=10;
        System.out.println("After <<, i's value is" + i);
        System.out.println("i's binary string is " + Integer.toBinaryString(i));
        System.out.println("--------------------2--------------------------");
        int i1 = 4992;
        System.out.println("Before >>, i1's value is " + i1);
        System.out.println("i1's binary string is " + Integer.toBinaryString(i1));
        i1>>=10;
        System.out.println("After >>, i1's value is" + i1);
        System.out.println("i1's binary string is " + Integer.toBinaryString(i1));
        System.out.println("---------------------3--------------------------");
        int i2 = -4992;
        System.out.println("Before >> , i2's value is" + i2);
        System.out.println("i2's binary string is " + Integer.toBinaryString(i2));
        i2>>=10;
        System.out.println("After >>, i2's value is " + i2);
        System.out.println("i2's binary string is " + Integer.toBinaryString(i2));
        System.out.println("----------------------4-------------------------");
        int i3 = -4992;
        System.out.println("Before >>> , i3's value is + i3");
        System.out.println("i3's binary string is " + Integer.toBinaryString(i3));
        i3>>>=33;
        System.out.println("After >>>, i3's value is" + i3);
        System.out.println("i3's binary string is " + Integer.toBinaryString(i3));
        System.out.println("-----------------------5-------------------------");
        int x = 4;
        int y = 5;
        x^=y;
        y^=x;
        x^=y;
        System.out.println("x="+ x);
        System.out.println("y="+ y);
    }
    
}
