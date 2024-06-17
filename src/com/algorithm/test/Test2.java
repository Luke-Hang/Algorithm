package com.algorithm.test;

/**
 * @author xiehang
 * @date 2023/1/12 15:13
 */
public class Test2 {
    public static void main(String[] args) {
        String s = "abc";

        System.out.println(s.substring(0, 1));//输出a，截取索引在[0，1)区间的字符串
        System.out.println(s.substring(1, 2));//输出b,截取索引在[1，2)区间的字符串
        System.out.println(s.substring(0));//输出abc，从索引0开始截取字符串
        System.out.println(s.substring(1));//输出bc，从索引1开始截取字符串
        System.out.println(s.length());
    }
}
