package com.algorithm.string;

/**
 * @author xiehang
 * @date 2023/1/28 10:19
 * https://leetcode.cn/problems/reverse-string-ii/
 */
public class N541 {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s, k));
    }

    public static String reverseStr(String s, int k) {
        int length = s.length();
        char[] chars = s.toCharArray();
        //左指针left = 0是为了定义反转位置的开始，右指针left+=2*k定义反转位置的结束。
        for (int left = 0; left < length; left += 2 * k) {
            //Math.min()起到的作用是，字符长度小于k时，全部反转
            //left + k 表示反转前k个字符，其余字符保持原样
            //left最左边索引，right最右边索引,索引是长度-1
            int right = Math.min(left + k, length) - 1;
            reverse(chars, left, right);
        }
        return String.valueOf(chars);
    }

    /**
     * 反转
     */
    private static char[] reverse(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return chars;
    }
}
