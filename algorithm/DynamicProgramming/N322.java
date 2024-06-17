package algorithm.algorithm.DynamicProgramming;

/**
 * @author xiehang
 * @date 2023/1/16 11:29
 * https://leetcode.cn/problems/coin-change/
 * ??????????????????????????????????????
 * 输入：coins = [1, 2, 5], amount = 11
 * 输出：3
 * 解释：11 = 5 + 5 + 1
 * 零钱兑换
 * 假设你有面值为 1, 2, 5 的硬币，你想求 amount = 11 时的最少硬币数（原问题），如果你知道凑出 amount = 10, 9, 6 的最少硬币数（子问题），
 * 你只需要把子问题的答案加一（再选一枚面值为 1, 2, 5 的硬币）求个最小值，就是原问题的答案
 * 因为硬币的数量是没有限制的，所以子问题之间没有相互制，是互相独立的。
 */
public class N322 {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int i = coinChange(coins, amount);
        System.out.println(i);
    }

    public static int coinChange(int[] coins, int amount) {
        return dp(coins, amount);
    }

    /**
     * 定义：要凑出金额 n，至少要 dp(coins, n) 个硬币
     */
    private static int dp(int[] coins, int amount) {
        int max = Integer.MAX_VALUE;
        int[] dp = new int[amount + 1];
        //初始化dp数组为最大值
        for (int j = 0; j < dp.length; j++) {
            dp[j] = max;
        }
        //当金额为0时需要的硬币数目为0
        dp[0] = 0;
        for (int i = 0; i < coins.length; i++) {
            //正序遍历：完全背包每个硬币可以选择多次
            for (int j = coins[i]; j <= amount; j++) {
                //只有dp[j-coins[i]]不是初始最大值时，该位才有选择的必要
                if (dp[j - coins[i]] != max) {
                    //选择硬币数目最小的情况
                    dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
                }
            }
        }
        return dp[amount] == max ? -1 : dp[amount];
    }
}
