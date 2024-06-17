package com.algorithm.backtrack.repeatnochoice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xiehang
 * @date 2023/1/6 10:26
 * https://leetcode.cn/problems/combination-sum-ii/
 * 给定一个候选人编号的集合 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * candidates 中的每个数字在每个组合中只能使用 一次 。
 * 输入: candidates =[10,1,2,7,6,1,5], target 8,
 * 输出:[[1,1,6],[1,2,5],[1,7],[2,6]]
 * 子集/组合问题：元素有重无复选
 */
public class N40 {
    public static List<List<Integer>> res = new ArrayList<>();
    public static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        combinationSum2(candidates, target);
    }

    /**
     * 体现在代码上Arrays.sort(candidates);，需要先进行排序，让相同的元素靠在一起，
     * 如果发现 nums[i] == nums[i-1]，说明相同的元素是靠再一起的，那么就直接跳过，相当于将该树枝剪掉
     */
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        //先进行排序，让相同的元素靠在一起
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, 0);
        return res;
    }

    /**
     * 子集/组合问题：元素有重无复选
     */
    public static void backtrack(int[] candidates, int target, int start, int sum) {
        //说明找到了合法的子集
        if (sum == target) {
            res.add(new ArrayList<>(list));
            return;
        }
        //路径上的和太大了，不需要继续遍历，直接结束即可
        if (sum > target) {
            return;
        }
        /**
         * 这里start控制树的生长，start=0时，递归使用i+1控制其中一棵树生长
         * start=2时，递归使用i+1控制第二棵树生长，以此类推
         * 递归从start开始，之前的数据就不会被遍历到
         */
        for (int i = start; i < candidates.length; i++) {
            // 剪枝逻辑，值相同的相邻树枝，只遍历第一条,相当于剪掉多余的树枝
            //[1, 1, 2, 5, 6, 7, 10]
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            list.add(candidates[i]);
            sum += candidates[i];
            backtrack(candidates, target, i + 1, sum);
            sum -= candidates[i];
            list.remove(list.size() - 1);
        }
    }
}
