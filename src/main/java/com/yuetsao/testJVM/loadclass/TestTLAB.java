package com.yuetsao.testJVM.loadclass;

/**
 * @ClassName TestTLAB
 * @Description
 * @Author caoyue
 * @Date 2021/5/25 8:01 下午
 * @Version V1.0
 **/
public class TestTLAB {
    class User {
        int id;
        String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    void alloc(int i) {
        new User(i, "name"+i);
    }

    public static void main(String[] args) {
        TestTLAB t = new TestTLAB();
        long start = System.currentTimeMillis();
        for(int i=0; i<1000_0000; i++) {
            t.alloc(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end -start);
    }
}
