package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注解的注解称之为元注解
 * 必须通过其他程序来读取和加载这些注解信息
 * @Target 描述注解的使用范围 （包，类，接口，成员变量，本地变量等）
 * @Retention 表示要在什么级别保留该注解信息，用于描述注解的生命周期 SOURCE源文件中有效 CLASS在class文件中有效 RUNTIME 在运行时有效 可以被反射时读取
 * @Documented
 * @Inherited
 * @Documented
 * */
@Target(value= {ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface CyAnnotation {
    //参数类型 参数名
    String studentName() default "";
    //定义默认值时经常使用负数 -1 表示不存在的含义
    int age() default 0;
    int id() default -1;
    String [] arr() default {};
    //如果注解只有一个属性，一般将注解名字定义为value
}
