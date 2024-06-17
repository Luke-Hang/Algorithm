package com.algorithm.DynamicProgramming;

/**
 * @author xiehang
 * @date 2023/1/19 14:28
 * 回文子串
 * https://leetcode.cn/problems/palindromic-substrings/
 * 输入：s = "abc"
 * 输出：3
 * 解释：三个回文子串: "a", "b", "c"
 */
public class N647 {

    public static int count = 0;

    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(countSubstrings(s));
    }

    public static int countSubstrings(String s) {
        for (int i = 0; i < s.length(); i++) {
            //回文串长度为奇数,比如"a",索引是(0,0)
            count(s, i, i);
            //回文串长度为偶数，比如"ab",索引是(0,1),所以此处+1
            count(s, i, i + 1);
        }
        return count;
    }

    //当start和end是(1,1)的时候，start--向左扩展字符串，end++向右扩展字符串，继续判断扩展后的字符串是否为回文串
    // 同时s.charAt(start) == s.charAt(end)判断了扩展后的字符串是否为回文串，如果是count++
    private static void count(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
            count++;
        }
    }
}
