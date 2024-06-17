package com.algorithm.string;

/**
 * @author xiehang
 * @date 2023/1/28 12:28
 * https://leetcode.cn/problems/ti-huan-kong-ge-lcof/
 */
public class offer05 {
    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println(pathEncryption(s));
    }

    public static String pathEncryption(String s) {
        String replace = s.replace(" ", "%20");
        return replace;
    }
}
