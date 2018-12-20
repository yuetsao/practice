package reflections;

/**
 * 测试java.lang.Class的获取方式
 */
public class Demo01 {
    public static void main(String[] args) {
        String path = "reflections.Bean";
        try {
            Class<?> clazz = Class.forName(path);
            //对象是表示或者封装一些数据。一个类被加载后，jvm会创建一个对应的Class对象，类的整个结构信息会放到Class对象中
            //这个Class对象就像一面镜子，通过这个Class对象就可以看到这个项目的整个结构信息
            //一个类只有一个Class对象，所以hashCode相同
            //数组的class和维度有关系
            System.out.println(clazz);
            System.out.println(clazz.hashCode());
            Class<String> stringClass = String.class;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
