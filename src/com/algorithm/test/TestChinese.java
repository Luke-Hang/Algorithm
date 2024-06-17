package com.algorithm.test;

/**
 * @author xiehang
 * @date 2023/4/16 14:52
 */
public class TestChinese {
    public static void main(String[] args) {
        Chinese obj1 = Chinese.getInstance();
        Chinese obj2 = Chinese.getInstance();
        System.out.println(obj1 == obj2);
    }
}
