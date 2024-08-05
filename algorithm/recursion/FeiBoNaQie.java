package algorithm.algorithm.recursion;


/**
 * @author xiehang
 * @date 2024/7/31 23:53
 *
 * 给定一个斐波那契数列 0,1, 1, 2,3, 5, 8,13, … ，求该数列的第 𝑛 个数字。
 *  设斐波那契数列的第 𝑛 个数字为 𝑓(𝑛) ，易得两个结论。
 *  ‧ 数列的前两个数字为 𝑓(1) = 0 和 𝑓(2) = 1 。
 *  ‧ 数列中的每个数字是前两个数字的和，即 𝑓(𝑛) = 𝑓(𝑛 − 1) + 𝑓(𝑛 − 2) 。
 *
 *
 *  从本质上看，递归体现了“将问题分解为更小子问题”的思维范式，这种分治策略至关重要
 *      1.从算法角度看，搜索、排序、回溯、分治、动态规划等许多重要算法策略直接或间接地应用了这种思维方式。
 *          适用于子问题分解，如树、图、分治、回溯等，代码结构简洁、清晰
 *      2.从数据结构角度看，递归天然适合处理链表、树和图的相关问题，因为它们非常适合用分治思想进行分析
 */
public class FeiBoNaQie {
    public static void main(String[] args) {
        int n=8;
        fibo(n);
    }

    private static int fibo(int n) {
        // 终止条件 f(1) = 0, f(2) = 1
        if (n == 1 || n == 2) {
            return n - 1;
        }
        // 递归调用 f(n) = f(n-1) + f(n-2)
        int res = fibo(n - 1) + fibo(n - 2);
        // 返回结果 f(n)
        return res;
    }
}
