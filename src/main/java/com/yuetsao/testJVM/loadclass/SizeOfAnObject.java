package com.yuetsao.testJVM.loadclass;

/**
 * @ClassName SizeOfAnObject
 * @Description
 * @Author caoyue
 * @Date 2021/5/25 4:58 下午
 * @Version V1.0
 **/
public class SizeOfAnObject {

    public static void main(String[] args) {
        System.out.println(ObjectSizeAgent.sizeOf(new Object()));
        System.out.println(ObjectSizeAgent.sizeOf(new int[] {}));
        System.out.println(ObjectSizeAgent.sizeOf(new P()));
    }

    private static class P {
        int id;
        String name;
        int age;

        byte b1;
        byte b2;
        Object o;
        byte b3;
    }
}
