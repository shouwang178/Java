package com.huawei;

import fish.Fish;

public class AccessCtrl {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.height = 183;//可以访问同一包内的public成员
        animal.sex = 1;//可以访问同一包内的default成员
        animal.type = 2;//可以访问同一包内的protected成员
        //animal.age，无法访问同一包内的private成员
        animal.setAge(12);
        animal.setName("Henry");
        System.out.println("animal = " + animal.toString());

        Cat cat = new Cat();
        cat.height = 173;//同包继承，子类可以访问父类的public成员
        cat.type = 2;//同包继承，子类可以访问父类的protected成员
        cat.sex = 1;//同包继承，子类可以访问父类的default成员
        //cat.age = 17;同包继承，子类无法访问父类private成员
        System.out.println("cat = " + cat.toString());

        Fish fish = new Fish();
        fish.height = 183;//不同包继承，子类可以访问父类的public成员
        fish.type = 2;//不同包继承，子类可以访问父类的protected成员
        fish.setType(4);
        //fish.sex = 5;不同包继承，子类无法访问父类的default成员
        //fish.name = "123"，无法访问不同包内的protected成员
    }
}
