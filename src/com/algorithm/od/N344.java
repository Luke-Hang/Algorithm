package com.algorithm.od;

/**
 * @author xiehang
 * @create 2022-12-16 11:55
 * 反转字符串
 * https://leetcode.cn/problems/reverse-string/
 */
public class N344 {
    public static void main(String[] args) {
        String[] str={"h","e","l","l","o"};
        char[] s={'h','e','l','l','o'};
        System.out.println(reverseString(s));
    }

    public static char[] reverseString(char[] s) {
        int right=s.length-1;
        for (int left = 0; left < right; left++,right--) {
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
        }
        return s;
    }
}
