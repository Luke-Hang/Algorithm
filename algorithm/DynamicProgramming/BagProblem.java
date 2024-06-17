package algorithm.algorithm.DynamicProgramming;

/**
 * @author xiehang
 * @date 2023/1/18 10:27
 * 确定dp数组（dp table）以及下标的含义:dp[i][j] 表示从下标为[0-i]的物品里任意取，放进容量为j的背包，价值总和最大是多少。
 * 确定递推公式
 * 不放物品i：当物品i的重量大于背包j的重量时,物品i无法放进背包中，所以被背包内的价值依然和前面相同：dp[i][j]=dp[i - 1][j]
 * 放物品i：背包放物品i得到的最大价值dp[i][j] = dp[i - 1][j - weight[i]] + value[i]
 * j - weight[i]背包容量j减去已装入的容量weight[i]就是当前需要装入的容量
 * 所以递推公式：dp[i][j] = max(dp[i - 1][j], dp[i - 1][j - weight[i]] + value[i]);
 * dp数组如何初始化
 * 确定遍历顺序
 * 举例推导dp数组
 */
public class BagProblem {
    public static void main(String[] args) {
        //背包容量
        int bagSize = 4;
        //物品重量
        int[] weight = {1, 3, 4};
        //物品价值
        int[] value = {15, 20, 30};
        testWeightBagProblem(weight, value, bagSize);
    }
    /**
     * 动态规划获得结果
     *
     * @param weight  物品重量
     * @param value   物品价值
     * @param bagSize 背包容量
     * dp[i][j] 表示从下标为[0-i]的物品里任意取，放进容量为j的背包，价值总和最大是多少。
     */
    private static void testWeightBagProblem(int[] weight, int[] value, int bagSize) {
        //创建dp数组
        //获取物品的数量
        int goods = weight.length;
        // j < weight[0]的时候，dp[0][j] 是 0，这里把dp数组预先初始化为0，dp[0][j]就是0
        int[][] dp = new int[goods][bagSize + 1];
        //初始化dp数组
        //dp[0][j] 应该是value[0]，因为背包容量足够放编号0的物品
        //给容量是bagSize的背包里放物品
        for (int j = weight[0]; j <= bagSize; j++) {
            dp[0][j] = value[0];
        }
        //dp[i][j]是由左上方数值推导出来了，其他下标初始为什么数值都可以，因为都会被覆盖。只不过一开始就统一把dp数组统一初始为0，更方便一些。
        // 填充dp数组
        for (int i = 1; i < weight.length; i++) {//先遍历物品
            for (int j = 1; j <= bagSize; j++) {//再遍历背包
                if (j < weight[i]) {//当前背包容量没有没有当前物品i大时，不妨物品，那么前i-1个物品能放下的最大价值就是当前情况的最大价值
                    dp[i][j] = dp[i - 1][j];
                } else {
                    //当前背包的容量可以放下物品i,此时分两种情况：
                    //1、不放物品i  2、放物品i 比较这两种情况下，哪种背包中物品的最大价值最大
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i]] + value[i]);
                }
            }
        }
        // 打印dp数组
        for (int i = 0; i < goods; i++) {
            for (int j = 0; j <= bagSize; j++) {
                System.out.print(dp[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
