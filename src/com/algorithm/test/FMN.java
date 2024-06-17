package com.algorithm.test;

/**
 * @author xiehang
 * @date 2023/4/16 15:46
 */
public class FMN {
    public static void main(String[] args) {
        String x = "fmn";
        x.toUpperCase();
        String y = x.replace('f', 'F');
        y = y + "wxy";
        System.out.println(y);
    }
}
