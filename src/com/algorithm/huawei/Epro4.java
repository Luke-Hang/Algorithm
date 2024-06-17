package com.algorithm.huawei;

/**
 * @author xiehang
 * @date 2023/4/17 14:18
 * hello would 输出位olleh dluow
 */
public class Epro4 {
    public static void main(String[] args) {
        String str = "hello would";
        String[] strs = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            String ss = reverseWord(strs[i]);
            sb.append(ss).append(" ");
        }
        System.out.println(sb.toString());
    }

    private static String reverseWord(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
        }
        return sb.reverse().toString();
    }
}
