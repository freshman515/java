package com.extends_;

public class Sub extends Base{
    public Sub(){
        //什么都不写会调用父类的无参构造
        //super 只能放在构造函数中的第一行，只能在构造函数中使用

        super("xiaohong",28);
        System.out.println("sub()");
    }
}
