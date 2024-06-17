package algorithm.algorithm.DynamicProgramming;

/**
 * @author xiehang
 * @date 2023/1/17 15:54
 * https://leetcode.cn/problems/unique-paths-ii/
 * 不同路径 II
 */
public class N63 {
    public static void main(String[] args) {
//        int[][] obstacleGrid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int[][] obstacleGrid ={{0,0},{1,1},{0,0}};
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        //3*2的网格，其m=obstacleGrid.length,n=obstacleGrid[0].length
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];

        //如果在起点或终点出现了障碍，直接返回0
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) {
            return 0;
        }
        //初始化,dp[i][0]一定都是1，因为从(0, 0)的位置到(i, 0)的路径只有一条
        for (int i = 0; i < m ; i++) {
            //第0列没有障碍物,将其初始化为1
            if (obstacleGrid[i][0] == 0) {
                dp[i][0] = 1;
            }
        }
        //那么dp[0][j]也同理,从(0, 0)的位置到(0, j)的路径只有一条
        for (int i = 0; i < n; i++) {
            //第0行没有障碍物，将其初始化为1
            if (obstacleGrid[0][i] == 0) {
                dp[0][i] = 1;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                //没有遇见障碍
                if (obstacleGrid[i][j] == 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                } else {//遇见障碍，将其置为0
                    dp[i][j] = 0;
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
