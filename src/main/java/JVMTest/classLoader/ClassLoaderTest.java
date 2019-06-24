package JVMTest.classLoader;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author caoyue
 * @description 测试不同的类加载器的两个类是否相等
 * @date 2019-06-21 11:27
 **/
public class ClassLoaderTest {
    public static void main(String[] args) throws Exception{
        ClassLoader myLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try {
                    String  fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
                    InputStream is = getClass().getResourceAsStream(fileName);
                    if(is == null) {
                        return super.loadClass(name);
                    }
                    byte[] b = new byte[is.available()];
                    is.read(b);
                    return defineClass(name, b, 0, b.length);
                }catch (IOException e) {
                    throw new ClassNotFoundException(name);
                }

            }
        };
        Object obj = myLoader.loadClass("JVMTest.classLoader.ClassLoaderTest").newInstance();
        System.out.println(obj.getClass());
        System.out.println(obj instanceof JVMTest.classLoader.ClassLoaderTest);

    }
}
