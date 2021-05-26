package com.yuetsao.testJVM.loadclass;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @ClassName YueClassLoader
 * @Description 定义自己的类加载器
 * @Author caoyue
 * @Date 2021/5/24 9:53 下午
 * @Version V1.0
 **/
public class YueClassLoader extends ClassLoader{

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        File f = new File("/Users/caoyue/practice/target/classes/"+name.replaceAll(".", "/").concat(".class"));
        try (FileInputStream fis = new FileInputStream(f);
             ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ) {
            System.out.println("hhhhhh");
            int b = 0;
            while ((b=fis.read()) != 0) {
                baos.write(b);
            }
            byte [] btyes = baos.toByteArray();
            return defineClass(name, btyes, 0, btyes.length);
        } catch (IOException e) {

        }
        return super.findClass(name);
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        ClassLoader l = new YueClassLoader();
        Class clazz = l.loadClass("com.yuetsao.testJVM.loadclass.Simple");
        Simple simple = (Simple) clazz.newInstance();
        simple.hello();

        System.out.println(l.getClass().getClassLoader());
        System.out.println(l.getParent());
    }
}
