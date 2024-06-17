package com.algorithm.backtrack.norepeatchoice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xiehang
 * @date 2023/1/5 17:40
 * 39. 组合总和
 * https://leetcode.cn/problems/combination-sum/
 * 输入：candidates = [2,3,6,7], target = 7
 * 输出：[[2,2,3],[7]]
 */
public class N39 {
    public static List<List<Integer>> res = new ArrayList<>();
    public static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
//        int[] candidates = {8, 7, 4, 3};
//        int target = 11;
        int[] candidates = {2,3,6,7};
        int target = 7;
        combinationSum(candidates, target);
    }

    /**
     * 元素无重有复选---组合/子集问题：
     */
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates, target,0,0);
        return res;
    }
    private static void backtrack(int[] candidates, int target, int sum, int start) {
        if (sum > target) {
            return;
        }
        //通过约束条件, 减少时间复杂度
        if (sum == target) {
            res.add(new ArrayList<>(list));
            return;
        }
        //如果本层的 sum + candidates[i]已经大于target，就可以结束本轮for循环的遍历
        for (int i = start; i < candidates.length; i++) {
            if (sum + candidates[i] > target) {
                break;
            }
            list.add(candidates[i]);
            sum += candidates[i];
            //每组集合元素可以重复，所以这里i不变
            backtrack(candidates, target,sum, i);
            //其实回溯算法关键在于:不合适就退回上一步
            sum -= candidates[i];
            //把最后一次加进来的数据重新弹出去
            list.remove(list.size() - 1);
        }
    }
}

