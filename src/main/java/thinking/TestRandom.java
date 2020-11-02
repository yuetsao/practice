package thinking;

import java.util.Random;

/**
 * Copyright (C),上品折扣
 * FileName: TestRandom
 * java 的随机函数是使用同余函数来实现的，另外还有一种是梅森旋转算法
 * @author caoyue
 * @date 2020 2020/10/23 11:29
 * description
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class TestRandom {
    public static void main(String[] args) {
        Random r = new Random(47);
        Integer num =  r.nextInt(19);
        System.out.println(num);
        Integer num1 = r.nextInt(19);
        System.out.println(num1);
        Integer num2 = r.nextInt(19);
        System.out.println(num2);
        Integer num3 = r.nextInt(19);
        System.out.println(num3);
        Integer num4 = r.nextInt(19);
        System.out.println(num4);
        
        Integer n1 = new Integer (47);
        Integer n2 = new Integer (47);
        System.out.println(n1.equals( n2));
        System.out.println("------"+ n1.hashCode());
        
        
        
        
    }
}
