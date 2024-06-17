package com.algorithm.backtrack.norepeatnochoice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiehang
 * @date 2023/1/12 11:26
 * https://leetcode.cn/problems/restore-ip-addresses/
 * 输入：s = "25525511135"
 * 输出：["255.255.11.135","255.255.111.35"]
 */
public class N93 {
    public static List<String> list=new ArrayList<>();
    public static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) {
        String s="25525511135";
        restoreIpAddresses(s);
    }
    public static List<String> restoreIpAddresses(String s) {
        int n = s.length() % 4;
        dfs(s,0);
        return list;
    }

    private static void dfs(String s, int start) {
        Integer value = Integer.valueOf(sb.toString());
        if (sb.length() <= 4 || value > 255) {
            list.add(sb.toString());
            return;
        }
        for (int i = start; i < s.length(); i++) {
            sb.append(s.charAt(i));
            dfs(s,i+1);
        }
    }
}

