package com.algorithm.string;

/**
 * @author xiehang
 * @date 2023/1/30 16:16
 * https://leetcode.cn/problems/valid-palindrome/
 */
public class N125 {
    public static void main(String[] args) {
//        String s = "A man, a plan, a canal: Panama";
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }

    /**
     * 解法一
     */
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            //java.lang.Character.isLetterOrDigit(char ch) 判断指定的字符是否为字母或数字
            if (Character.isLetterOrDigit(ch)) {
                //Character.toLowerCase将指定字符转换为小写字符,然后用sb.append进行拼接
                sb.append(Character.toLowerCase(ch));
            }
        }
        String str = sb.toString();
        //拼接后的sb和反转后的sb相等，则此字符串为回文串
        return str.equals(sb.reverse().toString());
    }
}
