package com;

/**
 * Author:Fanleilei
 * Created:2019/2/13 0013
 */

//super
public class Test8 {

    public static void main(String[] args) {
     new child().miaoshu();

    }
}


class parent{

    //父类的属性和方法必须是public，子类才能通过super来进行调用

    public String name="张三";
    //对于父类中的private（私有）的属性，子类也继承了，但是是隐式继承，子类能够使用的是所有非private操作，而所有的private操作无
    //法被直接使用
    private int age;
    public void print(){
        System.out.println("我是爸爸");
    }
}
class child extends parent{
     public  String name="李四";

    public void miaoshu(){
        //super.方法名（）
        super.print();
        //super.属性
        System.out.println(super.name);
        System.out.println("我是孩子");
    }
}