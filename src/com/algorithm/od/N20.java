package com.algorithm.od;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author xiehang
 * @create 2022-12-16 12:10
 * 有效的括号
 * https://leetcode.cn/problems/valid-parentheses/
 */
public class N20 {
    public static void main(String[] args) {
        String s = "()[]{}";
        if (s.length() > 0) {
            isValid(s);
        }
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('{', '}');

        for (int i = 0; i < s.length(); i++) {
            char at = s.charAt(i);
            if (map.containsKey(at)) {
                if (stack.isEmpty() || stack.peek() != map.get(at)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(at);
            }
        }
        return stack.isEmpty();
    }
}
