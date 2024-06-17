package com.algorithm.huawei;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author xiehang
 * @create 2022-04-17 18:36
 * 提取不重复的整数
 */
public class HJ9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = getInt1(new StringBuilder(), sc.nextInt());
//            getInt1(sb, anInt);
        System.out.println(str);
    }

    /**
     * 解法一
     * @param sb
     * @param anInt
     */
    private static String getInt1(StringBuilder sb, int anInt) {
        String value = String.valueOf(anInt);
        for (int i = value.length()-1; i >=0; i--) {
            char temp = value.charAt(i);
            if (sb.indexOf(String.valueOf(temp))>-1){
                continue;
            }else {
                sb.append(String.valueOf(temp));
            }
        }
        return sb.toString();
    }

    /**
     * 解法二
     * @param sb
     * @param anInt
     * @return
     */
    private static String getInt(StringBuilder sb, int anInt) {
        while (anInt>0){
            //每次该整数的余数，将其接到sb中
            int temp= anInt%10;
            //每次除10，相当于丢弃了最后一个数字
            anInt=anInt/10;
            //sb.indexOf(String.valueOf(temp)当sb中有temp时返回该数字的索引，没有时返回-1，相当于去了重
            //每次除10将最后一个数字作为余数，优先拼接到sb中
            if (sb.indexOf(String.valueOf(temp))>-1){
                continue;
            }else {
                sb.append(String.valueOf(temp));
            }
        }
        return sb.toString();
    }
}
