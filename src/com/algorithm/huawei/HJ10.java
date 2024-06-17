package com.algorithm.huawei;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 * @author xiehang
 * @create 2022-04-25 17:02
 * HJ10 字符个数统计
 * 编写一个函数，计算字符串中含有的不同字符的个数
 *
 */
public class HJ10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        //Hashset单列集合，元素无序且不接重复
        HashSet<Character> hs=new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            hs.add(str.charAt(i));
        }
        System.out.println(hs.size());
    }
}
