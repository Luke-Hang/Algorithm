package com.algorithm.backtrack.norepeatnochoice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiehang
 * @date 2023/1/10 10:12
 * 剑指 Offer II 083. 没有重复元素集合的全排列
 * https://leetcode.cn/problems/VvJkup/
 */
public class OfferII083 {
    public static boolean[] used;
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        permute(nums);
    }
    /**
     * 元素无重无复选---排列问题
     */
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        used=new boolean[nums.length];
        backtrack(nums,res,list);
        return res;
    }

    private static void backtrack(int[] nums, List<List<Integer>> res, List<Integer> list) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            list.add(nums[i]);
            used[i] = true;
            backtrack(nums, res, list);
            list.remove(list.size() - 1);
            used[i] = false;
        }
    }
}
