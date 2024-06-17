package com.algorithm.huawei;

/**
 * @author xiehang
 * @date 2023/4/17 14:30
 * abc是于0-9的整数abc,bcc是两个3位整数，请找出满足abc+bcc=532的所有abc的值?
 */
public class Epro6 {
    public static void main(String[] args) {
        for (int a = 0; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {
                    if (((a * 100) + (b * 10) + c) + ((b * 100) + (c * 10) + c) == 532) {
                        System.out.println(a + " " + b + " " + c + " ");
                        System.out.println("");
                    }
                }
            }
        }
    }
}
