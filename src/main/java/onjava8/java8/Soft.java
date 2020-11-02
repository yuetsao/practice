package onjava8.java8;

/**
 * Copyright (C),上品折扣
 * FileName: Soft
 *
 * @author caoyue
 * @date 2020 2020/10/29 15:54
 * description
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class Soft implements Strategy {
    @Override
    public String approach(String msg) {
        return msg.toLowerCase() + "?";
    }
    
}
