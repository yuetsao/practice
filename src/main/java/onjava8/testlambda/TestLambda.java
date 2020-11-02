package onjava8.testlambda;

import java.util.function.Supplier;

/**
 * Copyright (C),上品折扣
 * FileName: TestLambda
 *
 * @author caoyue
 * @date 2020 2020/10/31 22:10
 * description
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class TestLambda {
    public static void main(String[] args) {
        System.out.println(operation(100, x -> x*x));
    }
    public static Integer operation(Integer num, Myfunc mf){
        return mf.operate(num);
    }
}
