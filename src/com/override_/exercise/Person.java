package com.override_.exercise;

public class Person {
    private String name;
    private int age;
    public Person(){}
    public Person(String name,int age){
        this.age = age;
        this.name = name;
    }
    public String say(){
        return "name = "+name+" age = "+age;
    }

}
