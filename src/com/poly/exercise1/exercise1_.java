package com.poly.exercise1;

public class exercise1_ {
    public static void main(String[] args) {
        Master master = new Master("汤姆");
        Dog dog1 = new Dog("小黄");
        Cat cat1 = new Cat ("大橘");
        Bone bone1 = new Bone("大骨头");
        Fish fish1 = new Fish("小黄鱼");

        //master.feed(dog1,fish1);
        Pig pig1 = new Pig("xiaozhu");
        Rice damifan = new Rice("damifan");
        master.feed(pig1,damifan);

    }
}
