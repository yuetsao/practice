package onjava8.testlambda;

/**
 * Copyright (C),上品折扣
 * FileName: RecursiveFactorial
 *
 * @author caoyue
 * @date 2020 2020/10/29 17:17
 * description
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class RecursiveFactorial {
    static IntCall fact;

    public static void main(String[] args) {
        fact = n->n==0?1:n*fact.call(n-1);
        for(int i=0; i<=10; i++) {
            System.out.println(fact.call(i));
        }
    }
}
