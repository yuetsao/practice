package testJVM.loadclass;


public class ClassLoaderLevel {
    public static void main(String[] args) {
        //查看是谁 load 到内存的，执行结果为 null， 为什么为 null 呢？
        // Bootstrap 使用 c++ 来实现的， java 里并没有 class 和它对应
        System.out.println(String.class.getClassLoader());

        //这个是我们核心类库某个包里的类， 执行结果为 null ， 为什么它也是 null 呢？
        //因为它也是被我们 Bootstrap 类加载器加载的
        System.out.println(sun.awt.HKSCS.class.getClassLoader());

        //这个类是位于 ext 目录下的某个 jar 文件里的，当你调用它执行结果是：
        //sum.misc.launcher$ExtClassLoader ($represent innerClass)
        System.out.println(sun.net.spi.nameservice.dns.DNSNameService.class.getClassLoader());

        //这个是由 AppClassLoader 类加载器进行加载的：
        //sum.misc.launcher$AppClassLoader
        System.out.println(Simple.class.getClassLoader());

        //它的类加载器为 ExtClassLoader ，然后我们获取到以后获取 classLoader 的 class 的 classLoader 它是 null 也就是顶层的类加载器
        System.out.println(sun.net.spi.nameservice.dns.DNSNameService.class.getClassLoader().getClass().getClassLoader());
        System.out.println(Simple.class.getClassLoader().getClass().getClassLoader());

        System.out.println("--------");

        System.out.println(Simple.class.getClassLoader());
        System.out.println(Simple.class.getClassLoader().getClass().getClassLoader());
        System.out.println(Simple.class.getClassLoader().getParent());
        System.out.println(Simple.class.getClassLoader().getParent().getParent());
    }
}
