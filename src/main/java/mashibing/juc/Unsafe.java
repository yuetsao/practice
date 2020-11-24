package mashibing.juc;

import sun.misc.VM;
import sun.reflect.CallerSensitive;
import sun.reflect.Reflection;

/**
 * Copyright (C),上品折扣
 * FileName: Unsafe
 *
 * @author caoyue
 * @date 2020 2020/11/20 15:31
 * description
 */
public final class Unsafe {
    //单例对象
//    private static final Unsafe theUnsafe;
    
    private Unsafe() {
        
    }
    @CallerSensitive
    public static Unsafe getUnsafe() {
        Class var0 = Reflection.getCallerClass();
        // 仅在引导类加载器`BootstrapClassLoader`加载时才合法
        if(!VM.isSystemDomainLoader(var0.getClassLoader())) {
            throw new SecurityException("Unsafe");
        } else {
//            return theUnsafe;
            return null;
        }
    }
}
