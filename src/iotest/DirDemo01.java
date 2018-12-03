package iotest;

import java.io.File;

/**
 * 创建目录
 * 1 mkdir ：确保上级目录存在， 不存在就会创建失败
 * 2 mkdirs：上级目录可以不存在，不存在一同来创建
 * @author caoyue
 */
public class DirDemo01 {
    public static void main(String[] args) {
        File file = new File("/Users/caoyue/workspaces/practice/src/test2");
//        Boolean flag = file.mkdir();
//        System.out.println(flag);
        Boolean flag2 = file.mkdirs();
        System.out.println(flag2);
    }
}
