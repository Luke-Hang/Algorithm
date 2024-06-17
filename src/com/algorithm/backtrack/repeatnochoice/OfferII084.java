package com.algorithm.backtrack.repeatnochoice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xiehang
 * @date 2023/1/10 10:34
 * 剑指 Offer II 084. 含有重复元素集合的全排列
 * 给定一个可包含重复数字的整数集合 nums ，按任意顺序 返回它所有不重复的全排列。
 * 输入：nums = [1,1,2]
 * 输出：[[1,1,2],[1,2,1],[2,1,1]]
 */
public class OfferII084 {
    public static List<List<Integer>> res=new ArrayList<>();
    public static List<Integer> list=new ArrayList<>();
    public static boolean[] used;
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        permuteUnique(nums);
    }
    /**
     * 元素有重无复选---排列问题
     * @param nums
     * @return
     */
    public static List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        used=new boolean[nums.length];
        backtrack(nums);
        return res;
    }

    private static void backtrack(int[] nums) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1] && used[i - 1] == false) {
                continue;
            }
            used[i] = true;
            list.add(nums[i]);
            backtrack(nums);
            used[i] = false;
            list.remove(list.size() - 1);
        }
    }
}
