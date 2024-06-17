package algorithm.algorithm.DynamicProgramming;

/**
 * @author xiehang
 * @date 2023/1/17 10:36
 * 746. 使用最小花费爬楼梯
 * https://leetcode.cn/problems/min-cost-climbing-stairs/
 */
public class N746 {
    public static void main(String[] args) {
        int[] cost = {10,15,20};
        minCostClimbingStairs(cost);
    }

    /**
     * 定义状态,dp[i]的定义：到达第i台阶所花费的最少花费为dp[i]。
     * 题目 cost[i] 是从楼梯第 i 个台阶向上爬需要支付的费用，那么可以从下标i-1使用cost[i-1]花费达到下标i
     * 或者从下标i-2使用cost[i-2]花费达到下标i，即从0或1台阶开始爬楼梯
     * 为了使总花费最小，dp[i]应取上述两项的最小值，所以有dp[i] = Math.min(dp[i-1] + cost[i-1], dp[i-2] + cost[i - 2]);
     * 分析状态转移方程不能满足的特殊情况。
     * 得到最终解
     */
    public static int minCostClimbingStairs(int[] cost) {
        //数组cost的长度为n,则n个阶梯分别对应下标为0,n-1
        int n = cost.length;
        int[] dp = new int[cost.length + 1];
        // 从下标为 0 或下标为 1 的台阶开始，因此支付费用为0
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[n];
    }
}
