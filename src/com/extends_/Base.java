package com.extends_;

public class Base {
    public Base(){
        System.out.println("base()");
    }
    public Base(String name){
        this.name = name;
        System.out.println("base(String name)");
    }
    public Base(String name,int age){
        System.out.println("base(String,int)");
        this.name = name;
        this.age = age;
    }
    private String name;
    private int age;
}
