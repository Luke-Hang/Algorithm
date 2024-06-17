package com.algorithm.od;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xiehang
 * @create 2022-12-27 9:35
 * 亲密字符串
 * https://leetcode.cn/problems/buddy-strings/
 */
public class N859 {
    public static void main(String[] args) {
        String s="ab";
        String goal="ba";
        System.out.println(buddyStrings(s,goal ));
    }

    public static boolean buddyStrings(String s, String goal) {
        Set<Character> set=new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.remove(s.charAt(i))){
                set.add(s.charAt(i));
            }
        }

        char[] chars = s.toCharArray();
        char temp;
        temp = chars[0];
        chars[0] = chars[1];
        chars[1] = temp;

        String s1 = String.valueOf(chars);
        if (s1.equals(goal)) {
            return true;
        }

        return false;
    }
}
