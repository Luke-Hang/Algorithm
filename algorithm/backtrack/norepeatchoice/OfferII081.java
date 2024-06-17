package algorithm.algorithm.backtrack.norepeatchoice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xiehang
 * @date 2023/1/9 15:37
 * https://leetcode.cn/problems/Ygoe9J/
 * 输入: candidates = [2,3,6,7], target = 7
 * 输出: [[7],[2,2,3]]
 */
public class OfferII081 {
    public static List<List<Integer>> res = new ArrayList<>();
    public static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        combinationSum(candidates, target);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, 0);
        return res;
    }

    /**
     * 元素无重有复选---子集/组合问题
     */
    private static void backtrack(int[] candidates, int target, int sum, int start) {
        if (sum > target) {
            return;
        }

        if (sum == target) {
            res.add(new ArrayList<>(list));
            return;
        }

        //如果本层的 sum + candidates[i]已经大于target，就可以结束本轮for循环的遍历
        for (int i = start; i < candidates.length; i++) {
            if (sum + candidates[i] > target) {
                break;
            }
            list.add(candidates[i]);
            sum += candidates[i];
            backtrack(candidates, target, sum, i);
            sum -= candidates[i];
            list.remove(list.size() - 1);
        }
    }
}
