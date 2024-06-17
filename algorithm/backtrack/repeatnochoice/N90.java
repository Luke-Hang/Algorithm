package algorithm.algorithm.backtrack.repeatnochoice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xiehang
 * @date 2023/1/9 12:14
 * https://leetcode.cn/problems/subsets-ii/
 * 给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。
 * 解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列
 * 输入：nums = [1,2,2]
 * 输出：[[],[1],[1,2],[1,2,2],[2],[2,2]]。
 */
public class N90 {
    public static List<List<Integer>> res=new ArrayList<>();
    public static List<Integer> list=new ArrayList<>();

    public static void main(String[] args) {
//        int[] nums={1,2,2};
        int[] nums={4,4,4,1,4};
        subsetsWithDup(nums);
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums,0);
        return res;
    }

    /**
     * 有重无复选---子集/组合问题
     * @param nums
     * @param start
     */
    private static void backtrack(int[] nums, int start) {
        res.add(new ArrayList<>(list));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            list.add(nums[i]);
            backtrack(nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
