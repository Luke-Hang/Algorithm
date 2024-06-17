package com.algorithm.string;

/**
 * @author xiehang
 * @date 2023/1/28 14:48
 * https://leetcode.cn/problems/find-the-index-of-the-first-occurrence-in-a-string/
 */
public class N28 {
    public static void main(String[] args) {
//        String haystack = "sadbutsad", needle = "sad";
        String haystack = "leetcode", needle = "leeto";
        System.out.println(strStr(haystack, needle));
    }

    /**
     * 使用indexOf获取索引
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr(String haystack, String needle) {
        int index = haystack.indexOf(needle);
        return index;
    }
}
