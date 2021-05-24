package testJVM.loadclass;

/**
 * @ClassName ClassLoading
 * @Description
 * @Author caoyue
 * @Date 2021/5/25 12:32 上午
 * @Version V1.0
 **/
public class ClassLoading {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        ClassLoader classLoader = new YueClassLoader();
        Class clazz = classLoader.loadClass("testJVM.loadclass.Simple");
        Simple simple = (Simple) clazz.newInstance();

        classLoader = null;

        System.out.println(clazz.hashCode());

        classLoader = null;

        classLoader = new YueClassLoader();
        Class clazz1 = classLoader.loadClass("testJVM.loadclass.Simple");
        System.out.println(clazz1.hashCode());

        System.out.println(clazz == clazz1);
    }
}
