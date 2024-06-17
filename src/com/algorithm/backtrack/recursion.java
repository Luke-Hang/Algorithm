package com.algorithm.backtrack;

/**
 * @author xiehang
 * @date 2023/2/7 10:32
 */
public class recursion {
    public static void main(String[] args) {
        String s="aa";
        String str="abcba";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome2(s));
        System.out.println(isPalindrome2(str));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            //java.lang.Character.isLetterOrDigit(char ch) 确定指定的字符是否为字母或数字
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }

    /**
     * 判断字符串是否是回文字符串"a","b"单独的字符串也是回文字符串
     */
    private static boolean isPalindrome2(String str) {
        int end = str.length() - 1;
        for (int i = 0; i < end; i++) {
            if (str.charAt(i) != str.charAt(end)) {
                return false;
            }
            end--;
        }
        return true;
    }
}
