package com.algorithm.backtrack.norepeatnochoice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiehang
 * @date 2023/1/4 11:18
 * 46. 全排列
 * https://leetcode.cn/problems/permutations/
 * 输入：nums = [1,2,3]
 * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 * 排列问题：元素无重无复选
 */
public class N46 {
    /**
     * 记录全排列集合
     */
    // used 中的元素会被标记为 true
    public static boolean[] used;
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> lists = permute(nums);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
    }
//    List<T> result;
    private static List<List<Integer>> permute(int[] nums) {
        //记录全排列集合,路径
        List<List<Integer>> res = new ArrayList<>();
        //记录每个集合，选择列表
        List<Integer> list = new ArrayList<>();
        used = new boolean[nums.length];
        backtrack(res, list, nums);
        return res;
    }
    //    void backtrack(路径, 选择列表):
    //        if (满足结束条件){
    //        result.add(路径)
    //        return;
    //    }
    private static void backtrack(List<List<Integer>> res, List<Integer> list, int[] nums) {
        //递归出口
        //当集合的长度与nums长度相等，说明一个全排列集合已经组装完成，将其加入到记录全排列集合中
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
//        for(选择：选择列表)
//        做选择;
//        backtrack(路径, 选择列表);
//        撤销选择;
/*        for (int num : nums) {
            if (!list.contains(num)) {
                //递归在不断缩小范围，向出口条件靠拢
                list.add(num);
                //进入下一层决策树
                backtrack(res, list, nums);
                //撤销选择，把之前add进来的num remove掉
                //当一个集合组装完成，并加入了res，就退出backtrack方法，同时将集合的最后一个元素删除
                list.remove(list.size() - 1);
            }
        }*/

        //i从0开始，保证不重复
        for (int i = 0; i < nums.length; i++) {
            //如果元素使用过，则不再加入集合
            if (used[i]){
                continue;
            }
            used[i]=true;
            list.add(nums[i]);
            // 进入下一层回溯树
            backtrack(res, list, nums);
            // 取消选择
            used[i]=false;
            list.remove(list.size() - 1);
        }
    }
}
