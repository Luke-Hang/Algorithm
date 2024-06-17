package com.algorithm.huawei;

import java.util.Scanner;

/**
 * @author xiehang
 * @create 2022-04-25 17:33
 * 字符串反转
 */
public class HJ12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.append(str).reverse().toString());
    }
}
