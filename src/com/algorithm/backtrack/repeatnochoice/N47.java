package com.algorithm.backtrack.repeatnochoice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xiehang
 * @date 2023/1/6 11:42
 * https://leetcode.cn/problems/permutations-ii/
 * 输入：nums = [1,1,2]
 * 输出：[[1,1,2],[1,2,1],[2,1,1]]
 * 排列问题：元素有重无复选
 */
public class N47 {
    /**
     * used 数组标记已经在路径上的元素避免重复选择，然后收集所有叶子节点上的值，就是所有全排列的结果
     */
    static boolean[] used;

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        permuteUnique(nums);
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        //先进行排序，让相同的元素靠在一起
        Arrays.sort(nums);
        used = new boolean[nums.length];
        backtrack(res, list, nums);
        return res;
    }

    /**
     * [[1,2,2'],[1,2',2],
     * [2,1,2'],[2,2',1],
     * [2',1,2],[2',2,1]]
     * 保证相同元素在排列中的相对位置保持不变。
     * 思路：每次还是从集合中选择元素，但对于选过的元素(保证元素在排列中的相对位置固定，就可以拿到没有选过的元素)直接continue
     * 排列问题：元素有重无复选
     */
    private static void backtrack(List<List<Integer>> res, List<Integer> list, int[] nums) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        //!used[i - 1]前面的那个元素没有被用过
        // nums[i] == nums[i - 1] && !used[i - 1] 如果前面相邻且相等的元素没有被用过，则跳过
        // 当出现重复元素时，比如输入 nums = [1,2,2',2'']， 2'只有在2已经被使用的情况下才会被选择，如果2没被使用过，那么2'也不能被使用，
        // 同理，2'' 只有在 2' 已经被使用的情况下才会被选择。
        // used[i]保证元素没被使用过，!used[i - 1]保证相同元素在排列中的相对位置固定
        for (int i = 0; i < nums.length; i++) {
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                continue;
            }
            used[i] = true;
            list.add(nums[i]);
            backtrack(res, list, nums);
            used[i] = false;
            list.remove(list.size() - 1);
        }
    }
}
