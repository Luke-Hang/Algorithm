package algorithm.algorithm.DynamicProgramming;

/**
 * @author xiehang
 * @date 2023/1/17 15:02
 * https://leetcode.cn/problems/unique-paths/
 * 不同路径
 * 输入：m = 3, n = 7
 * 输出：28
 */
public class N62 {
    public static void main(String[] args) {
        int m=3;
        int n=7;
        uniquePaths(m,n);
    }

    /**
     定义状态dp[i,j]
     递推公式dp[i][j] = dp[i - 1][j] + dp[i][j - 1]，因为dp[i][j]只能从这两个方向过来
     初始化,dp[i][0]一定都是1，因为从(0, 0)的位置到(i, 0)的路径只有一条，
     那么dp[0][j]也同理,从(0, 0)的位置到(0, j)的路径只有一条
     确定遍历顺序
     */
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        //第0列初始化为1
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        //第0行初始化为1
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        //从第一行开始
        //dp[i - 1][j] 表示从(0, 0)的位置到(i - 1, j)有几条路径,dp[i][j - 1]同理
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                //dp[2][3] = dp[1][3] + dp[2][2];dp[2][3]只能由dp[1][3]或dp[2][2]过来
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        //机器人从(0 , 0) 位置出发，到(m - 1, n - 1)终点。
        //网格是m*n,所以索引坐标就是m-1,n-1
        return dp[m - 1][n - 1];
    }
}
