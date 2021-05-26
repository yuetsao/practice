package com.yuetsao.testJVM.loadclass;

import java.lang.instrument.Instrumentation;

/**
 * @ClassName ObjectSizeAgent
 * @Description
 * @Author caoyue
 * @Date 2021/5/25 4:46 下午
 * @Version V1.0
 **/
public class ObjectSizeAgent {
    private static Instrumentation inst;

    public static void premain(String agentArgs, Instrumentation _inst) {
        inst = _inst;
    }
    public static long sizeOf(Object o) {
        return inst.getObjectSize(o);
    }
}
