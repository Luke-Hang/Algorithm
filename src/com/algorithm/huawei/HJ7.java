package com.algorithm.huawei;

import java.util.Scanner;

/**
 * @author xiehang
 * @create 2022-04-17 17:06
 * 取近似值
 */
public class HJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nextFloat = sc.nextFloat();
        nextFloat = (nextFloat - (int) nextFloat) >= 0.5 ? ((int) nextFloat + 1) : (int) nextFloat;
        System.out.println((int) nextFloat);
    }
}
