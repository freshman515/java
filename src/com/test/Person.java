package com.test;

public class Person {
    private String name;
    private int age;
    public Person(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.contains("wang")) return;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void getInfo(){
        System.out.println("i am "+name+" age = "+age);
    }
    public void say(){
        System.out.println("i am a person");
    }
}
