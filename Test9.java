package com;

/**
 * Author:Fanleilei
 * Created:2019/2/13 0013
 */
public class Test9 {
    //当使用 +、-、*、/、%、运算操作时，除了double、float、long类型的
    //操作数为：byte、short、int 、char，两个数都会被转换成int类型，并且结果也是int类型
    public static void test() {
        byte b1=1,b2=2,b3,b6,b8;
        final byte b4=4,b5=6,b7=9;
        //b3=(b1+b2); /*语句1 error*/ //b3是byte类型的，b1+b2 结果是int类型的
        b3=(byte)(b1+b2);
        System.out.println("b3="+b3);
        b6=b4+b5; /*语句2*/
        System.out.println("b6="+b6);
        //b8=(b1+b4); /*语句3* error/ //b8是byte类型的，b1+b4 结果是int类型的
        b8=(byte)(b1+b4);
        System.out.println("b8="+b8);
        //b7=(b2+b5); /*语句4* error/  //b7是byte类型的，且是final修饰的，b7的值不能修改

        System.out.println(b3+b6);

    }

    public static void main(String[] args) {
         test();
    }
}
