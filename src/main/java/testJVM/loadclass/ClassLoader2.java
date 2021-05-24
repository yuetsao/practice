package testJVM.loadclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @ClassName ClassLoader2
 * @Description todo 这里相等？？为什么呢？
 * @Author caoyue
 * @Date 2021/5/25 12:36 上午
 * @Version V1.0
 **/
public class ClassLoader2{

    public static class MyLoader extends ClassLoader {
        @Override
        public Class<?> loadClass(String name) throws ClassNotFoundException {
            File f = new File("/Users/caoyue/practice/target/classes/"+name.replaceAll(".", "/").concat(".class"));
            if(!f.exists()) {
                return super.loadClass(name);
            }
            try (InputStream is = new FileInputStream(f);){
                byte[] b = new byte[is.available()];
                is.read(b);
                return defineClass(name, b, 0, b.length);
            }catch (Exception e) {
                e.printStackTrace();
            }
            return super.loadClass(name);
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        MyLoader my = new MyLoader();
        Class clazz = my.loadClass("testJVM.loadclass.Simple");

        my = new MyLoader();
        Class clazz2 = my.loadClass("testJVM.loadclass.Simple");

        System.out.println(clazz == clazz2);
    }
}
