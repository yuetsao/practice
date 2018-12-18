package gof23.Singleton;

/**
 * 调用效率高
 * 避免了反射和反序列化的漏洞
 * 没有延迟加载
 *
 */
public enum EnumSingleton {
    INSTANCE;
    public void whateverMethod() {
    //需要做的事情放在这个方法里面
    }

}
