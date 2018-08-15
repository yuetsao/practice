package com.yuetsao.innertest;

abstract class Base {
    public Base(int i) {
        System.out.println("Base Constructor" + i);
    }
    public abstract void f();
}
public class AnonymousConstructor {
    //不要求i一定是final的，因为它是传递给匿名类的构造器，它并不会在匿名类内部被调用
    public static Base getBase(int i) {
        return new Base(i) {
            { System.out.println("inside instance initilizer");}
            public void f() {
            System.out.println("in anoymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}
