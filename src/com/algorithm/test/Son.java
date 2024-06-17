package com.algorithm.test;

/**
 * @author xiehang
 * @date 2023/4/16 23:25
 */
public class Son extends Father{
    public Son() {
        //super();此处为隐士调用
        System.out.println("子类的构造方法");
        get7();
    }
    public static void get7(){
        System.out.println(111);
    }
}
