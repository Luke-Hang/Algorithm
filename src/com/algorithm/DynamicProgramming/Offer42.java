package com.algorithm.DynamicProgramming;

/**
 * @author xiehang
 * @date 2023/1/18 18:07
 * https://leetcode.cn/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/
 * 剑指 Offer 42. 连续子数组的最大和
 */
public class Offer42 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(nums);
    }
    public static int maxSubArray(int[] nums) {
        //历史最大值
        int res=nums[0];
        //当前最大值
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            //sum + nums[i]要么比nums[i]，要么比nums[i]大，我们取最大的即可
            sum = Math.max(nums[i], sum + nums[i]);
            //每次循环都更新历史最大值
            res=Math.max(res,sum);
        }
        return res;
    }
}
