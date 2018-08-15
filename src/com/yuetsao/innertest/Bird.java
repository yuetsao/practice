package com.yuetsao.innertest;

public abstract class Bird {
    private String name;
    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }
    public abstract int fly();
}
