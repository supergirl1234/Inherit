package com;

/**
 * Author:Fanleilei
 * Created:2019/2/13 0013
 */
public class Test6 {
    public static void main(String[] args) {

        //子类继承父类，则子类对象实例化之前一定先实例化父类对象。
        new teacher();
    }

}


class people{

    private String name;
    private int age;

    public people() {

        System.out.println("这是父类的构造方法");
    }
}

class teacher extends people{

    private int num;

    public teacher() {
        //super();//父类的构造方法是无参时，在在子类的构造方法中隐含了该语句
        System.out.println("这是子类的构造方法");
    }
}