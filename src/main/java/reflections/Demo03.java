package reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 动态通过反射api 动态操作方法属性
 */
public class Demo03 {
    public static void main(String[] args) {
        System.out.println(1);
        //动态操作构造器
        String path = "reflections.Bean";
        try {
            Class<?> clazz = Class.forName(path);
            Bean bean = (Bean)clazz.newInstance();
            System.out.println(bean);//这个地方就是要加入无参构造器的原因，因为很多框架需要通过反射的方式来动态创建对象
            //通过反射方法调用普通方法
            Method method = clazz.getDeclaredMethod("setBeanName", String.class);
            //invoke方法,这样就可以动态的调用相关的方法
            method.invoke(bean, "cy");//<=>bean.setBeanName("cy");
            System.out.println(bean.getBeanName());
            //通过反射操作属性
            Field f = clazz.getDeclaredField("beanName");
            f.setAccessible(true);
            f.set(bean,"xtc");
            System.out.println(bean.getBeanName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.getMessage();
            System.out.println(e);
        } catch (InstantiationException e) {
            e.getMessage();
            System.out.println(e);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
