package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 1定义注解
 * 2使用注解
 * 3通过解析程序读出注解，进行处理
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CyField {
    String columnName ();
    String type();
    int lenght();
}
