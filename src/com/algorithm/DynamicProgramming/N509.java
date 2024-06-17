package com.algorithm.DynamicProgramming;

/**
 * @author xiehang
 * @date 2023/1/13 11:25
 * 斐波那契数
 * https://leetcode.cn/problems/fibonacci-number/
 * F(0) = 0，F(1) = 1
 * F(n) = F(n - 1) + F(n - 2)，其中 n > 1
 * 输入：n = 2
 * 输出：1
 * 解释：F(2) = F(1) + F(0) = 1 + 0 = 1
 */
public class N509 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fib(n));
    }
/*    public static int fib(int n) {
        //base case
        if (n == 0 || n == 1) {
            return n;
        }
        //递推关系
        return fib(n - 1) + fib(n - 2);
    }*/

    /**
     * 带备忘录的递归解法
     * @param n
     * @return
     */
/*    public static int fib(int n) {
        //创建备忘录，并将每个置为0
        //数组索引是从0开始的，数据个数需要+1
        //f(0)需要的数组大小是0+1=1
        int[] memo=new int[n+1];
        return helper(n,memo);
    }*/
    //明确 base case -> 明确「状态」-> 明确「选择」 -> 定义 dp 数组/函数的含义。
/*    private static int helper(int n, int[] memo) {
        //base case
        if (n == 0 || n == 1) {
            return n;
        }
        //默认memo是0，如果不是0，说明该数据已参与过计算，不用再次参与计算了
        if (memo[n] != 0) {
            return memo[n];
        }
        //F(n) = F(n - 1) + F(n - 2)状态转移方程
        // 将算过的结果存到备忘录里面，以备查询用
        memo[n]=helper(n-1,memo)+helper(n-2,memo);
        return memo[n];
//        return helper(n-1,memo)+helper(n-2,memo);
    }*/

    //dp 数组的迭代（递推）解法
/*    private static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }*/

    private static int fib(int n) {
        //明确 base case
        if (n == 0 || n == 1) {
            return n;
        }
        //3.dp数组如何初始化
        int pre = 0;
        int cur = 1;
        //递推关系，当前参数变第一个参数，sum变第二个参数，继续递推
        //4.确定遍历顺序
        for (int i = 2; i <= n; i++) {
            //2.确定递推公式，也就是状态转移方程
            int sum = pre + cur;
            //当前参数变第一个参数
            pre = cur;
            //sum变第二个参数
            cur = sum;
        }
        return cur;
    }
}
