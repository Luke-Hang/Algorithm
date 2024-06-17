package algorithm.algorithm.backtrack.norepeatchoice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xiehang
 * @date 2023/2/3 10:50
 */
public class P39 {
    public static List<List<Integer>> res=new ArrayList<>();
    public static List<Integer> list=new ArrayList<>();
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        combinationSum(candidates,target);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        def(candidates,target,0,0);
        return res;
    }

    /**
     * 元素无重有复选---子集/组合问题
     */
    private static void def(int[] candidates, int target, int start, int sum) {
        if (sum==target){
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (sum + candidates[i] > target) {
                break;
            }
            list.add(candidates[i]);
            sum+=candidates[i];
            def(candidates,target,i,sum);
            sum-=candidates[i];
            list.remove(list.size()-1);
        }
    }
}
