package com.algorithm.test;

/**
 * @author xiehang
 * @date 2023/4/17 14:10
 * hello would 输出位 olleh dluow
 */
public class HelloTest {
    public static void main(String[] args) {
        String str="hello would";
        String[] strs = str.split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            String s = reverseByChar(strs[i]);
            sb.append(s).append(" ");
        }
        System.out.println(sb.toString());
    }

    private static String reverseByChar(String str) {
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
        }
        return sb.reverse().toString();
    }
}
