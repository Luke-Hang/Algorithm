package algorithm.algorithm.array.leetCode;

import java.util.Arrays;

//https://leetcode.cn/problems/running-sum-of-1d-array
public class N1480 {
    public static void main(String[] args) {
//        Integer[] nums = {3, 1, 2, 10, 1};
        int[] nums = {2, 5, 3, 6};
        int[] ints = runningSum(nums);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] runningSum(int[] nums) {
        // 1. 创建结果数组
        int[] arr = new int[nums.length];
        // 2. 初始化累加变量
        int sum = 0;
        // 3. 使用循环遍历数组
        for (int i = 0; i < nums.length; i++) {
            // 4. 更新累加变量
            sum = sum + nums[i];
            // 5. 保存当前累加结果
            arr[i] = sum;
        }
        return arr;
    }
}
