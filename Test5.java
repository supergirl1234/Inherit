package com;

/**
 * Author:Fanleilei
 * Created:2019/2/13 0013
 */

//匿名内部类
//匿名内部类必须继承一个抽象类或者实现一个接口
//匿名内部类是没有构造方法的，因为它没有类名
//与局部内部相同匿名内部类也可以引用方法形参。此形参也必须声明为 final
//匿名内部类是没有访问修饰符的
interface  MyIntreface{

    void test();
}

class Outter{

    private int num;
    public void display(){
     // 匿名内部类，实现了MyInterface接口
        new MyIntreface(){
            public void test(){

                System.out.println("匿名内部类");
            }

        }.test();
    }
}
public class Test5 {
    public static void main(String[] args) {
        Outter p1=new Outter();
        p1.display();
    }

}
