package algorithm.algorithm.backtrack.norepeatnochoice;

import java.util.ArrayList;
import java.util.List;
/**
 * @author xiehang
 * @date 2023/1/9 9:37
 * https://leetcode.cn/problems/combinations/
 * 给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
 * 输入：n = 4, k = 2
 * 输出：[[2,4],[3,4],[2,3],[1,2],[1,3],[1,4],]
 */
public class N77 {
    public static List<List<Integer>> res=new ArrayList<>();
    public static List<Integer> list=new ArrayList<>();
    public static void main(String[] args) {
        int n = 4, k = 2;
        combine(n,k);
    }
    public static List<List<Integer>> combine(int n, int k) {
        backtrack(n,k,1);
        return res;
    }

    /**
     * 子集问题，无重复，无复选
     */
    private static void backtrack(int n, int k, int start) {
        if (list.size() == k) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i <= n; i++) {
            list.add(i);
            backtrack(n,k,i+1);
            list.remove(list.size()-1);
        }
    }
}

