package reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 利用反射的api获取类的信息（名字，属性，方法，构造器）
 */
public class Demo02 {
    public static void main(String[] args) {
        String path = "reflections.Bean";
        try {
            Class<?> clazz = Class.forName(path);
            System.out.println(clazz.getName());
            System.out.println(clazz.getSimpleName());
            //获得属性，方法，构造器
            Field[] fields = clazz.getFields();//这里获得的全是public的
            System.out.println(fields.length);
            Field[] fields1 = clazz.getDeclaredFields();//获得所有的field
            System.out.println(fields1.length);
            for (Field field: fields1) {
                System.out.println(field);
            }
            Method[] methods = clazz.getMethods();//这里获得public的
            Method[] methods1 = clazz.getDeclaredMethods();//获得所有的method
            clazz.getMethod("setBeanName", String.class);//这里加上String.class是为了区分方法的签名，所以必须传递参数的类型对应的class对象
            for (Method m: methods1) {
                System.out.println(m.getName());
            }
            Constructor[] constructors = clazz.getDeclaredConstructors();
            for(Constructor constructor : constructors) {
                System.out.println(constructor);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.getMessage();
        }
    }
}
