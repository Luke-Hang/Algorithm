package com.algorithm.od;

/**
 * @author xiehang
 * @create 2022-12-26 10:52
 * 判断子序列
 * https://leetcode.cn/problems/is-subsequence/
 */
public class N392 {
    public static void main(String[] args) {
        String s="abc";
        String t="ahbgdc";
        System.out.println(isSubsequence(s,t));
    }

    public static boolean isSubsequence(String s, String t) {
        int slow=0;
        int fast=0;

        while (slow < s.length() && fast < t.length()) {
            if (s.charAt(slow)==t.charAt(fast)){
                slow++;
            }
            fast++;
        }
        return slow==s.length();
    }
}
