package algorithm.algorithm.divideconquer;

import java.util.List;

/**
 * @author xiehang
 * @date 2024/9/29 15:28
 * <p>
 * <p>
 * <p>
 * 给定三根柱子，记为 A、 B 和 C 。起始状态下，柱子 A 上套着 𝑛 个圆盘，它们从上到下按照从小到大的
 * 顺序排列。我们的任务是要把这 𝑛 个圆盘移到柱子 C 上，并保持它们的原有顺序不变
 */
public class HanoiTower {


    /* 求解汉诺塔问题 */
    void solveHanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        int n = A.size();
        // 将 A 顶部 n 个圆盘借助 B 移到 C
        dfs(n, A, B, C);
    }

    /**
     * 求解汉诺塔问题 f(i)
     * 将柱 src 顶部的 𝑖 个圆盘借助缓冲柱 buf 移动至目标柱 tar
     *
     */
    void dfs(int i, List<Integer> src, List<Integer> buf, List<Integer> tar) {
        // 若 src 只剩下一个圆盘，则直接将其移到 tar
        if (i == 1) {
            move(src, tar);
            return;
        }
        // 子问题 f(i-1) ：将 src 顶部 i-1 个圆盘借助 tar 移到 buf
        dfs(i - 1, src, tar, buf);
        // 子问题 f(1) ：将 src 剩余一个圆盘移到 tar
        move(src, tar);
        // 子问题 f(i-1) ：将 buf 顶部 i-1 个圆盘借助 src 移到 tar
        dfs(i - 1, buf, src, tar);
    }

    /* 移动一个圆盘 */
    void move(List<Integer> src, List<Integer> tar) {
        // 从 src 顶部拿出一个圆盘
        Integer pan = src.remove(src.size() - 1);
        // 将圆盘放入 tar 顶部
        tar.add(pan);
    }
}
