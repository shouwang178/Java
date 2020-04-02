package com.huawei;

public class Cat extends Animal {

    private int width;

    protected int corlor;

    public int country;

    int province;

    public Cat() {
        type = 1;//子类可以访问父类protect成员
        sex = 2;//子类可以访问父类default成员
    }

    @Override
    public String toString() {
        return "com.huawei.Cat{" +
                "width=" + width +
                ", corlor=" + corlor +
                ", country=" + country +
                ", province=" + province +
                ", height=" + height +
                ", type=" + type +
                ", sex=" + sex +
                '}';
    }
}
