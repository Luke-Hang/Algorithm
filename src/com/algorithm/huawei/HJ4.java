package com.algorithm.huawei;

import java.util.Scanner;

/**
 * @author xiehang
 * @create 2022-04-24 22:08
 * 字符串分隔
 */
public class HJ4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        if (str.length()>0){
            getStr(str);
        }
    }

    private static void getStr(String str) {
        if (str.length()>8){
            //截取前8个字符输出,str.substring(0, 8)==str.substring[0, 8)
            String substring = str.substring(0, 8);
            System.out.println(substring);
            //从str第8个字符开始截取substring.substring(8)==substring.substring[8...)
            getStr(str.substring(8));
        }else {
            StringBuilder sb=new StringBuilder();
            sb.append(str);
            int n = 8 - (str.length());
            while (n>0) {
                sb.append("0");
                n--;
            }
            System.out.println(sb.toString());
        }
    }
}
