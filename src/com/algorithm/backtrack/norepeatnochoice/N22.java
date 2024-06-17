package com.algorithm.backtrack.norepeatnochoice;

import java.util.ArrayList;
import java.util.List;
/**
 * @author xiehang
 * @date 2023/1/12 9:35
 * https://leetcode.cn/problems/generate-parentheses/
 * 输入：n = 3
 * 输出：["((()))","(()())","(())()","()(())","()()()"]
 */
public class N22 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        int n = 3;
        generateParenthesis(n);
    }

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        dfs(n, n, list);
        return list;
    }

    /**
     * 全排列
     */
    private static void dfs(int left, int right, List<String> list) {
        //左右括号都拼接完了，终止递归
        if (left == 0 && right == 0) {
            list.add(sb.toString());
            return;
        }
        //拼接左括号
        if (left > 0) {
            sb.append("(");
            dfs(left - 1, right, list);
            sb.deleteCharAt(sb.length() - 1);
        }
        //right>left如果右括号多余左括号的剩余量，拼接右括号
        if (right > left) {
            sb.append(")");
            dfs(left, right - 1, list);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
