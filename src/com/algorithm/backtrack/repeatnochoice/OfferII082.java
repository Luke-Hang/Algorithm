package com.algorithm.backtrack.repeatnochoice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xiehang
 * @date 2023/1/9 18:09
 * https://leetcode.cn/problems/4sjJUc/
 * 输入: candidates = [10,1,2,7,6,1,5], target = 8,
 * [[1,1,6],[1,2,5],[1,7],[2,6] ]
 */
public class OfferII082 {

    public static List<List<Integer>> res = new ArrayList<>();
    public static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        combinationSum2(candidates,target);
    }

    /**
     * 有重无复选---组合/子集问题
     */
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, 0);
        return res;
    }

    private static void backtrack(int[] candidates, int target, int start, int sum) {
        //当sum > target时，再循环累加已经毫无意义
        if (sum > target) {
            return;
        }
        if (sum == target) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i - 1] == candidates[i]) {
                continue;
            }
            list.add(candidates[i]);
            sum += candidates[i];
            backtrack(candidates, target, i + 1, sum);
            list.remove(list.size() - 1);
            sum -= candidates[i];
        }
    }
}
