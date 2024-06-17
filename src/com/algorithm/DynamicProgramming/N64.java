package com.algorithm.DynamicProgramming;

/**
 * @author xiehang
 * @date 2023/1/17 17:31
 * 最小路径和
 * https://leetcode.cn/problems/minimum-path-sum/
 * 最小路径和
 */
public class N64 {
    public static void main(String[] args) {
//        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int[][] grid = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(minPathSum(grid));
    }

    public static int minPathSum(int[][] grid) {
        //行
        int m = grid.length;
        //列
        int n = grid[0].length;
        if (m == 0 || n == 0) {
            return 0;
        }
        // 初始化第0列,(2,0)只能由(1，0)过来
        for (int i = 1; i < m; i++) {
            grid[i][0] += grid[i - 1][0];
        }
        // 初始化第0行,(0,2)只能由(0，1)过来
        for (int j = 1; j < n; j++) {
            grid[0][j] += grid[0][j - 1];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                //取grid[i - 1][j]和grid[i][j - 1]中的最小值，即路径上的数字和最小
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[m - 1][n - 1];
    }
}
