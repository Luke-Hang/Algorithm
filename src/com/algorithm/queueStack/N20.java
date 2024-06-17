package com.algorithm.queueStack;

import java.awt.event.FocusEvent;

/**
 * @author xiehang
 * @create 2022-04-16 16:07
 * 20. 有效的括号
 * https://leetcode-cn.com/problems/valid-parentheses/comments/
 */
public class N20 {
    public static void main(String[] args) {
        String s = "(([]){})";
        if (s.length() > 0) {
            System.out.println(isValid(s));
        }
    }

    private static boolean isValid(String s) {
        int length = s.length();
        //输入的字符串是奇数，括号不可能成对出现，返回false
        if (length % 2 != 0) {
            return false;
        }

        //将括号用空字符串replace，那么s的长度就是0，不是0就说明括号不成对
        for (int i = 0; i < length; i++) {
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        }
        return s.length() == 0;
    }
}
