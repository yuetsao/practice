package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * 使用反射读取注解的信息，模拟处理注解信息的流程
 */
public class Demo03 {
    public static void main(String[] args) {
        try {
            //包含这个类的全部信息，包含他的注解
            Class clazz = Class.forName("annotation.CyStudent");
            //获得这个类的所有注解
            Annotation[] annotations = clazz.getDeclaredAnnotations();
            //直接通过名字获得
            clazz.getAnnotation(CyStudent.class);
            //获得类属性的注解
            Field studentNameField = clazz.getDeclaredField("studentName");
            //获取字段中的注解
            Annotation studentNameFieldAnnotation = studentNameField.getAnnotation(CyField.class);
            System.out.println(((CyField) studentNameFieldAnnotation).columnName()+"--"+((CyField) studentNameFieldAnnotation).type()+"--"+((CyField) studentNameFieldAnnotation).lenght()+"studentNameFieldAnnotation");
            //根据注解获得的表名， 字段的信息，拼接出ddl语句，使用jdbc执行这个sql
            for (Annotation a: annotations) {
                System.out.println(a);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
