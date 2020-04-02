package com.huawei;

public class Animal {
    private String name;

    private int age;

    public int height;

    protected int type;

    int sex;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "com.huawei.Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", type=" + type +
                ", sex=" + sex +
                '}';
    }
}
