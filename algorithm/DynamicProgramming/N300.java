package algorithm.algorithm.DynamicProgramming;

import java.util.Arrays;

/**
 * @author xiehang
 * @date 2023/1/18 17:54
 * https://leetcode.cn/problems/longest-increasing-subsequence/
 * 最长递增子序列
 * 输入：nums = [10,9,2,5,3,7,101,18]
 * 输出：4
 * 解释：最长递增子序列是 [2,3,7,101]，因此长度为 4 。
 */
public class N300 {
    public static void main(String[] args) {
        /**
         *  1.dp[i]表示i之前包括i的以nums[i]结尾的,最长递增子序列的长度
         *  2.递推公式
         *      当nums[i]=nums[j]时，比较无意义，所以j从0到i-1，此时dp[i]=dp[j]+1
         */
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(lengthOfLIS(nums));
    }

    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        //Arrays.fill()将指定的 int 值分配给指定 int 型数组中的每个元素，
        // Arrays.fill(dp, 1)将指定int值1分配给数组dp的每个元素
        //每一个i，对应的dp[i]（即最长递增子序列）起始大小至少都是1，即将数组dp全部初始化为1
        Arrays.fill(dp, 1);
        //所以初始化的时候，所有的元素都应该初始化为1
        // 寻找 nums[0..j-1]即0..i-1 中比 nums[i] 小的元素
        //因为nums[i]>nums[j]，所以把nums[i]接到nums[j]后面，就形成了包含nums[i]的新的递增子序列，其长度为dp[j]+1
        //也就是形成了以nums[i]结尾的新的递增子序列，其长度为dp[j]+1
        for (int i = 0; i < nums.length; i++) {
            //nums[0..j-1]
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    //以nums[i]结尾的新的递增子序列，其长度为dp[i]，
                    // 获取能使dp[i]长度大的元素，可能是dp[i]，可能是dp[j] + 1即dp[i-1] + 1,累加1,挨个填充dp数组
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        //记录结果
        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
