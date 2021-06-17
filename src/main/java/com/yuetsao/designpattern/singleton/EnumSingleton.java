package com.yuetsao.designpattern.singleton;

/**
 * @ClassName EnumSingleton
 * @Description
 * @Author caoyue
 * @Date 2021/6/6 11:33 上午
 * @Version V1.0
 **/
public enum EnumSingleton {

    INSTANCE;

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
