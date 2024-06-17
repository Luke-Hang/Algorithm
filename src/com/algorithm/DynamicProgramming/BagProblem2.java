package com.algorithm.DynamicProgramming;

/**
 * @author xiehang
 * @date 2023/1/18 12:14
 * dp[i][j] 表示从下标为[0-i]的物品里任意取，放进容量为j的背包，价值总和最大是多少。
 * 滚动数组:条件是上一层可以重复利用，直接拷贝到当前层
 */
public class BagProblem2 {
    public static void main(String[] args) {
        /** dp[i][j] 表示从下标为[0-i]的物品里任意取，放进容量为j的背包，价值总和最大是多少
         *  1.确定dp数组含义
         *      在一维数组种，dp[i]表示：容量为j的背包，所背物品价值最大可以为dp[j]
         *  2.确定递推公式
         *      dp[j]表示容量为j的背包所背的最大价值
         *      dp[j - weight[i]]表示容量为j - weight[i]的背包所背的最大价值
         *      此时dp[j]有两个选择，
         *          1.一个是取自己dp[j] 相当于 二维dp数组中的dp[i-1][j]，即不放物品i，
         *          2.一个是取dp[j]=dp[j - weight[i]] + value[i]，即放物品i，指定是取最大的，毕竟是求最大价值，
         *          所以递归公式为：
         *              dp[j] = Math.max(dp[j], dp[j-weight[i]] + value[i]);
         *  3.dp数组如何初始化
         *  4.确定遍历顺序
         */
        //背包容量
        int bagWight = 4;
        //物品重量
        int[] weight = {1, 3, 4};
        //物品价值
        int[] value = {15, 20, 30};
        testWeightBagProblem(weight, value, bagWight);
    }

    private static void testWeightBagProblem(int[] weight, int[] value, int bagWight) {
        int length = weight.length;
        //定义dp数组，dp[j]表示背包容量为j时，能获得的最大价值
        int[] dp = new int[bagWight + 1];
        for (int i = 0; i < length; i++) {//先便利物品
            //列表后面的值需要通过与前面的值比较确定，因此要倒序遍历，优先处理列表后面的值，
            // 容量j必须大于物品重量j >weight[i]
            for (int j = bagWight; j >= weight[i]; j--) {//遍历背包
                dp[j] = Math.max(dp[j], dp[j - weight[i]] + value[i]);
            }
        }
        //打印dp数组
        for (int i = 0; i <=bagWight ; i++) {
            System.out.print(dp[i] + " ");
        }
    }
}
