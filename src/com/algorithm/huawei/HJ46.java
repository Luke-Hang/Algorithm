package com.algorithm.huawei;

import java.util.Scanner;

/**
 * @author xiehang
 * @create 2022-04-17 22:22
 * 截取字符串
 * 输入一个字符串和一个整数 k ，截取字符串的前k个字符并输出
 */
public class HJ46 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        String substring = str.substring(0, k);
        System.out.println(substring);
    }
}
