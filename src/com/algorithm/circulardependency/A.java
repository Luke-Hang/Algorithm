package com.algorithm.circulardependency;

/**
 * @author xiehang
 * @date 2023/3/14 15:12
 */
public class A {
    private B b;

    public A() {
        System.out.println("---A created success");
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
}
