package com.yuetsao.innertest;

public class Test {
    public void test(Bird bird) {
        System.out.println(bird.getName()+ "能够飞"+ bird.fly() + "米");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.test(new Bird() {
            public int fly() {
                return 10000;
            }
            public String getName() {
                return "大雁";
            }
        });
    }
}
