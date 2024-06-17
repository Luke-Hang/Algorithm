package com.algorithm.od;

/**
 * @author xiehang
 * @create 2022-12-16 11:01
 *  验证回文串
 *  https://leetcode.cn/problems/valid-palindrome/
 */
public class N125 {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
//        String s = "race a car";
//        String s = "12p21";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            //java.lang.Character.isLetterOrDigit(char ch) 确定指定的字符是否为字母或数字
            if (Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}
