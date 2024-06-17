package com.algorithm.generics;

/**
 * @author xiehang
 * @create 2022-04-11 21:45
 * Java 泛型（generics）是 JDK 5 中引入的一个新特性, 泛型提供了编译时类型安全检测机制，该机制允许开发者在编译时检测到非法的类型。
 * 泛型的本质是参数化类型，也就是说所操作的数据类型被指定为一个参数。
 *
 * 泛型带来的好处：在没有泛型的情况的下，通过对类型 Object 的引用来实现参数的“任意化”，“任意化”带来的缺点是要做显式的强制类型转换，而这种
 * 转换是要求开发者对实际参数类型可以预知的情况下进行的。对于强制类型转换错误的情况，编译器可能不提示错误，
 * 在运行的时候才出现异常，这是本身就是一个安全隐患。
 * 那么泛型的好处就是在编译的时候能够检查类型安全，并且所有的强制转换都是自动和隐式的。
 */
public class Generics <T>{
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public static void main(String[] args) {

    }

    public void noSpecifyType(){
        Generics generics = new Generics();
        generics.setT("test");
        //需要强制类型转换
        String test = (String) generics.getT();
        System.out.println(test);
    }
    public void spcifyType(){
        Generics<String> generics = new Generics<>();
        generics.setT("test");
        //不需要强制类型转换
        String test = generics.getT();
        System.out.println(test);
    }
}
