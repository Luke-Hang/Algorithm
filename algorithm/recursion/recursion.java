package algorithm.algorithm.recursion;

/**
 * @author xiehang
 * @date 2024/7/31 23:48
 *
 * 完成 1 + 2 + ⋯ + 𝑛 的计算
 */
public class recursion {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(recur(n));
    }

    /**
     * 递：当函数被调用时，系统会在“调用栈”上为该函数分配新的栈帧，用于存储函数的局部变量、参数、返回地址等数据。
     * 归：当函数完成执行并返回时，对应的栈帧会被从“调用栈”上移除，恢复之前函数的执行环境。
     * @param n
     * @return
     */
    private static int recur(int n) {
        // 终止条件
        if (n == 1) {
            return 1;
        }
        // 递：递归调用
        int res = recur(n - 1);
        // 归：返回结果
        return n + res;
    }
}
