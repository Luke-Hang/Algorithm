package com.algorithm.DynamicProgramming;

import java.util.Arrays;

/**
 * @author xiehang
 * @date 2023/1/19 9:30
 * 最长连续递增序列
 * https://leetcode.cn/problems/longest-continuous-increasing-subsequence/
 */
public class N674 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 4, 7};
        System.out.println(findLengthOfLCIS(nums));
    }

    /**
     * [1, 3, 5, 4, 7]
     * 最长递增子序列： [1,3,5,7],尽管它也是升序的子序列，但它不是连续的，因为5和7在原数组中被4隔开
     * 最长连续递增序列:[1,3,5],长度为3，这个是升序的子序列，且元素1,3,5在原数组中是连续的
     * N300最长递增子序列
     * N674最长连续递增序列
     * 递增序列需要连续，所以一定nums[i] > nums[i - 1]，那么dp[i] = dp[i - 1] + 1
     * 即以i为结尾的连续递增的子序列长度一定等于以i - 1为结尾的连续递增的子序列长度 + 1
     * 因为本题要求连续递增子序列，所以就必要比较nums[i]与nums[i - 1]
     */
    public static int findLengthOfLCIS(int[] nums) {
        int[] dp = new int[nums.length];
        //Arrays.fill(dp, 1)将指定int值1分配给数组dp的每个元素
        Arrays.fill(dp, 1);
        for (int i = 1; i < nums.length; i++) {
            //nums[i] > nums[i - 1]，那么以 i 为结尾的连续递增的子序列长度 一定等于 以i - 1为结尾的连续递增的子序列长度 + 1，
            // 因为dp[i]都是1，所以相邻数据之间相差也是1，即：dp[i] = dp[i - 1] + 1;
            if (nums[i] > nums[i - 1]) {//说明以nums[i]结尾的递增子序列是连续的
                dp[i] = dp[i - 1] + 1;//累加1,挨个填充dp数组
            }
        }
        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
