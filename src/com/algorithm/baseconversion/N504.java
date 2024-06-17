package com.algorithm.baseconversion;

/**
 * @author xiehang
 * @create 2022-04-25 9:21
 * 给定一个整数 num，将其转化为 7 进制，并以字符串形式输出。
 * https://leetcode-cn.com/problems/base-7/
 */
public class N504 {
    public static void main(String[] args) {
        System.out.println(convertToBase7(10));
    }
    public static String convertToBase7(int num) {
        String str = Integer.toString(num, 7);
        return str;
    }
}
