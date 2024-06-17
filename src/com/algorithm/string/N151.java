package com.algorithm.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author xiehang
 * @date 2023/1/28 14:05
 * https://leetcode.cn/problems/reverse-words-in-a-string/
 * 反转字符串中的单词
 */
public class N151 {
    public static void main(String[] args) {
//        String s = "the sky is blue";
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        //s.trim()去掉s前后两端空格
        //正则匹配连续的空白字符作为分隔符分割,\\s+,第一个\是转义，第二个\s是空格,+表示一个或多个空格
        // \\s+匹配一个或多个空白字符
        String[] strs = s.trim().split("\\s+");
        //Arrays.asList()将数组转为集合
        List<String> list = Arrays.asList(strs);
        Collections.reverse(list);
        //String.join(CharSequence delimiter, CharSequence... elements)
        System.out.println(String.join(" ", list));
        //用给定的连接符连接所有元素，并返回一个新字符串
        return String.join(" ", list);
    }
}
