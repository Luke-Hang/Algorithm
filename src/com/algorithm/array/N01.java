package com.algorithm.array;

/**
 * @author xiehang
 * @create 2022-12-13 15:01
 * https://leetcode.cn/problems/two-sum/
 */
public class N01 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 18;
        int[] ints = twoSum(arr, target);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);

        }
    }

    /**
     * 双指针
     */
    public static int[] twoSum(int[] nums, int target) {
        //存放目标数组
        int[] res = new int[2];
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                res[0] = left;
                res[1] = right;
                break;
            } else if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            }
        }
        return res;
    }
}
