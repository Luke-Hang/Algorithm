package com.algorithm.backtrack.norepeatnochoice;

import com.algorithm.backtrack.repeatnochoice.N47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xiehang
 * @date 2023/1/9 11:25
 * https://leetcode.cn/problems/subsets/
 * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
 * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
 * 输入：nums = [1,2,3]
 * 输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 */
public class N78 {
    public static List<List<Integer>> res = new ArrayList<>();
    public static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        subsets(nums);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        backtrack(nums, 0);
        return res;
    }

    /**
     * 子集问题，无重复，无复选
     */
    private static void backtrack(int[] nums, int start) {
        //空集也加，所以这里无条件
        res.add(new ArrayList<>(list));
        for (int i = start; i < nums.length; i++) {
            list.add(nums[i]);
            backtrack(nums,i+1);
            list.remove(list.size()-1);
        }
    }
}
