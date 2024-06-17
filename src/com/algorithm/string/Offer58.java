package com.algorithm.string;

/**
 * @author xiehang
 * @date 2023/1/28 14:35
 * https://leetcode.cn/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 */
public class Offer58 {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseLeftWords(s, k));
    }

    public static String reverseLeftWords(String password, int target) {
        //从0开始，截取password前target个字符
        String str1 = password.substring(0, target);
        //从target开始截取整个字符串
        String str2 = password.substring(target);
        //相加就可以完成 将 password 前 target 个字符按原顺序移动至字符串末尾
        return str2+str1;
    }
}
