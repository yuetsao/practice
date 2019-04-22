package iotest;

import java.io.File;

/**
 * 列出下一级
 * 1 list 列出下级名称
 * 2 listFiles 列出下级file对象
 *
 * 列出所有的盘符： listRoots（）
 */
public class DirDemo02 {
    public static void main(String[] args) {
        File file = new File("/Users/caoyue/workspaces/practice/src");

        //下级名称
        String [] subNames = file.list();
        for(String s: subNames) {
            System.out.println(s);
        }
        //下级对象
        File [] subFiles = file.listFiles();
        for(File s: subFiles) {
            System.out.println(s.getAbsoluteFile());
        }
        //所有盘符
        File [] roots = file.listRoots();
        for(File r: roots) {
            System.out.println(r.getAbsolutePath());
        }
    }
}
