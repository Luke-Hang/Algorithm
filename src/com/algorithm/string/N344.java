package com.algorithm.string;

/**
 * @author xiehang
 * @date 2023/1/28 9:51
 * https://leetcode.cn/problems/reverse-string/
 */
public class N344 {
    public static void main(String[] args) {
        char[] str = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(reverseString(str));
    }

    /**
     * 双指针法反转字符数组
     */
    public static char[] reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return s;
    }

    public static char[] reverseString2(char[] s) {
        int length = s.length;
        for (int left = 0, right = length - 1; left < right; left++, right--) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
        }
        return s;
    }
}