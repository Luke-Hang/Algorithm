package algorithm.algorithm.array;

/**
 * @author xiehang
 * @date 2023/1/31 14:17
 * https://leetcode.cn/problems/climbing-stairs/
 * 爬楼梯问题
 */
public class N70 {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(climbStairs(n));
    }

    /**
     * 双指针
     */
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int sum = 0;
        int pre = 1;
        int cur = 2;
        for (int i = 3; i <= n; i++) {
            sum = pre + cur;
            pre = cur;
            cur = sum;
        }
        return sum;
    }
}
