package com.algorithm.huawei;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author xiehang
 * @create 2022-04-25 17:36
 * 句子逆序
 */
public class HJ13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        extracted(str);
    }

/*    private static void extracted(String str) {
        String[] split = str.split(" ");
        for (int i = split.length-1; i >=0 ; i--) {
            System.out.print(split[i]+" ");
        }
    }*/

    private static void extracted(String str) {
        String[] split = str.split("\\s+");
        List<String> list = Arrays.asList(split);
        Collections.reverse(list);
        System.out.println(String.join(" ",list));
    }
}
