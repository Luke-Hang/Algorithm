package algorithm.algorithm.DynamicProgramming;

/**
 * @author xiehang
 * @date 2023/1/16 15:33
 * https://leetcode.cn/problems/climbing-stairs/
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 输入：n = 2
 * 输出：2
 */
public class N70 {
    public static void main(String[] args) {
        int n=3;
        climbStairs(n);
    }

    /**
     * 上 1 阶台阶：有 1 种方式
     * 上 2 阶台阶：有 1+1 和 2 两种方式
     * 上 3 阶台阶：我们只能从第 2 阶或者第 1 阶 到达第 3 阶，所以到达第 3 阶的方法总数就是到第 1 阶和第 2 阶的方法数之和。
     * 4阶 只能从2阶或者3阶开始，2种+3种=5种
     * 上 n 阶台阶：我们只能从第 n-1 阶或者第 n-2 阶 到达第 n 阶，所以到达第 n 阶的方法总数就是到第 n-1 阶和第 n-2 阶的方法数之和。
     */
    public static int climbStairs(int n) {
        //1.确定dp数组以及下标的含义 dp[i]： 爬到第i层楼梯，有dp[i]种方法
        //2.确定递推公式 dp[i]=dp[i-1]+dp[i-2]
        //3.dp数组如何初始化,dp[1] = 1，dp[2] = 2，这个初始化大家应该都没有争议的
        //所以我的原则是：不考虑dp[0]如何初始化，只初始化dp[1] = 1，dp[2] = 2，然后从i = 3开始递推，这样才符合dp[i]的定义
        //4.确定遍历顺序 从递推公式dp[i] = dp[i - 1] + dp[i - 2];中可以看出，遍历顺序一定是从前向后遍历的
        //5.举例推导dp数组
/*        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        //当第一次输入n=2时，如果i从3开始，会出现索引越界错误
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];*/
        if (n <= 2) {
            return n;
        }
        //第1个台阶有1种方法
        //第2个台阶有2种方法
        //第3个台阶第三级台阶有1+2=3种方法
        int pre = 1, cur = 2, sum = 0;
        for (int i = 3; i <= n; i++) {
            //所以第3级台阶是pre + cur，一次类推后面都是前2个台阶方法之和即sum = pre + cur
            sum = pre + cur;
            //原当前台阶变成前一个台阶
            pre = cur;
            //台阶之和变成当前台阶
            cur = sum;
        }
        return sum;
    }
}
