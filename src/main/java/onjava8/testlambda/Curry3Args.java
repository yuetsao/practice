package onjava8.testlambda;

/**
 * Copyright (C),上品折扣
 * FileName: Curry3Args
 *
 * @author caoyue
 * @date 2020 2020/11/2 11:18
 * description
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
import java.util.function.*;

public class Curry3Args {
    public static void main(String[] args) {
        Function<String,
                Function<String,
                        Function<String, String>>> sum =
                a -> b -> c -> a + b + c;
        Function<String,
                Function<String, String>> hi =
                sum.apply("Hi ");
        Function<String, String> ho =
                hi.apply("Ho ");
        System.out.println(ho.apply("Hup"));
    }
}
