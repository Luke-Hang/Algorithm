package algorithm.algorithm.backtrack.norepeatnochoice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiehang
 * @date 2023/1/9 15:03
 * https://leetcode.cn/problems/uUsW3B/
 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 * 输入: n = 4, k = 2
 * 输出:[[2,4],[3,4],[2,3],[1,2],[1,3],[1,4],]
 */
public class OfferII080 {
    public static List<List<Integer>> res=new ArrayList<>();
    public static List<Integer> list=new ArrayList<>();
    public static void main(String[] args) {
        int n = 4, k = 2;
        combine(n,k);
    }
    public static List<List<Integer>> combine(int n, int k) {
        baktrack(n,k,1);
        return res;
    }
    /**
     * 元素无重无复选---子集/组合问题
     * 范围[1,n]
     * 数量k
     */
    private static void baktrack(int n, int k, int start) {
        //list.size()+n - start + 1(区间[1，n])<k,不可能构造出长度为k的list,
        //list.size()不会为空，最小也是k，那么再加上区间区间[1，n]绝对大于k
        if ((n - start + 1) + list.size() < k) {
            return;
        }

        if (list.size()==k){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i <= n; i++) {
            list.add(i);
            baktrack(n,k,i+1);
            list.remove(list.size()-1);
        }
    }
}
