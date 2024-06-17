package com.algorithm.backtrack.norepeatnochoice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiehang
 * @date 2023/1/11 17:00
 * https://leetcode.cn/problems/letter-combinations-of-a-phone-number/
 * 输入：digits = "23"
 * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
 */
public class N17 {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        String digits = "23";
        letterCombinations(digits);
    }

    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return list;
        }
        //将电话号码中的数字对应的元素列举出来
        String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mon", "pqrs", "tuv", "wxyz"};
        def(list, digits, numString, 0);
        return list;
    }

    //子集问题---无重复，无复选
    private static void def(List<String> list, String digits, String[] numString, int index) {
        if (sb.length() == digits.length()) {
            list.add(sb.toString());
            return;
        }
        //digits.charAt(index) - '0';获取字符串digits的某个元素并将其作为int类型的index，
        //digits.charAt(0) - '0' 获取字符串digits的第0个元素2并将其作为int的index 2，也就是numString[2]
        //比如digits = "23",int index=digits.charAt(0) - '0' index此时就是字符2，digits.charAt(index)="abc"
        //获取numString对应索引的元素，即是电话号码对应的数字
        String str = numString[digits.charAt(index) - '0'];
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            def(list, digits, numString, index + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}