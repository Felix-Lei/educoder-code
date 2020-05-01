package com.xuleifeng;
public class TestMain{
    public static void main(String args[]){
    MyClass mc1 = new MyClass();
    MyClass mc2 = new MyClass();
    mc1.a = 100;
    mc1.b = 200;
    mc2.a = 300;
    mc2.b = 400;
    System.out.println(mc1.a);
    System.out.println(mc1.b);
    System.out.println(mc2.a);
    System.out.println(mc2.b);
    }
}

class MyClass {
    int a;
    static int b;
    void fa(){
    }
    static void fb(){
    }
    public void m1(){
        System.out.println(a);    //位置1
        System.out.println(b);    //位置2
        fa();                     //位置3
        fb();                     //位置4
    }
    public static void m2(){
        System.out.println(a);    //位置5
        System.out.println(b);    //位置6
        fa();                    //位置7
        fb();                    //位置8
    }
}