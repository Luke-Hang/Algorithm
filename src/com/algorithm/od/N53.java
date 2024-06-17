package com.algorithm.od;

import java.util.Arrays;

/**
 * @author xiehang
 * @create 2022-12-28 16:53
 * 最大子数组和
 * https://leetcode.cn/problems/maximum-subarray/
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 子数组是数组中的一个连续部分。
 */
public class N53 {
    public static void main(String[] args) {
//        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums = {-1};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        //dp[i]：以nums[i]为结尾的最大连续子序列的和
        int[] dp = new int[nums.length];
        //dp数组初始化
        dp[0] = nums[0];
        //记录结果
        int res = nums[0];
        //int[] nums={-2,1,-3,4,-1,2,1,-5,4};，
        for (int i = 1; i < nums.length; i++) {
            // nums[i] i从1开始，dp[1] = Math.max(nums[1], dp[0] + nums[1]);
            //dp[i - 1] + nums[i]有可能比nums[i]大，也有可能比nums[i]小
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
        }
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    public static int maxSubArray2(int[] nums) {
        //当前最优解
        int sum = 0;
        //历史最优解
        int res = nums[0];
        for (int num : nums) {
            /**
             * dp[i]：以nums[i]为结尾的最大连续子序列，其和为dp[i]。
             * 因为要连续，所以dp[i]只有两个方向可以推出来：
             *  dp[i - 1] + nums[i]，即：nums[i]加入当前连续子序列的和
             *  nums[i]，即：从头开始计算当前连续子序列和
             */
            sum = Math.max(sum + num, num);
            res = Math.max(sum, res);
        }
        return res;
    }
}
