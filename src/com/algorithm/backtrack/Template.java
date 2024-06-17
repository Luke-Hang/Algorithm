package com.algorithm.backtrack;

/**
 * @author xiehang
 * @date 2023/1/4 17:25
 * 回溯算法解题套路框架
 * 其实回溯算法和我们常说的 DFS 算法非常类似，本质上就是一种暴力穷举算法。
 * 回溯算法和 DFS 算法的细微差别是：回溯算法是在遍历「树枝」，DFS 算法是在遍历「节点」
 */
public class Template {
/*  List<T> result;
    void backtrack(路径, 选择列表):
        if (满足结束条件){
            result.add(路径)
            return;
        }
    for(选择：选择列表)
    做选择;
    backtrack(路径, 选择列表);

    撤销选择;
    撤销选择,把最后一次加进来的数据重新弹出去
    比如1，2，3，4组合，1进去后再加入2 成为1，2其满足条件后，将2回溯撤销掉，然后加入3，变为1，3，这样我们才能得到一个1，3的组合
    */

//    无论是 子集/组合，排列 问题，简单说无非就是让你从序列 nums 中以给定规则取若干元素，主要有以下几种变体：

//    形式一、元素无重无复选，即 nums 中的元素都是唯一的，每个元素最多只能被使用一次，这也是最基本的形式。
//    以组合为例，如果输入 nums = [2,3,6,7]，和为 7 的组合应该只有 [7]。
//    元素无重无复选，即 nums 中的元素都是唯一的，每个元素最多只能被使用一次
    /**
     * 这里i从start开始，表示第一层回溯树
     * 下一层i=start+1时，递表示下一层回溯树，从而保证nums[start]这个元素不会被重复使用
     * 递归从start开始，之前的数据就不会被遍历到
     */

//1.组合/子集问题，i从start开始，每次i+1
    /* 组合/子集问题回溯算法框架 */ //通过start索引来控制重复
/*    void backtrack(int[] nums, int start) {
        // 回溯算法标准框架
        for (int i = start; i < nums.length; i++) {
            // 做选择
            track.addLast(nums[i]);
            // 注意参数，通过start
            backtrack(nums, i + 1);
            // 撤销选择
            list.remove(list.size()-1);
        }
    }*/

//2.排列问题，i从0开始
    /* 排列问题回溯算法框架 */
/*    void backtrack(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            // 剪枝逻辑，没法通过start索引来控制重复，通过used数组来控制重复
            if (used[i]) {
                continue;
            }
            // 做选择
            used[i] = true;
            track.addLast(nums[i]);
            backtrack(nums);
            // 撤销选择
            list.remove(list.size() - 1);
            used[i] = false;
        }
    }*/

//    形式二、元素无重有复选，即 nums 中的元素都是唯一的，每个元素可以被使用若干次。
//    以组合为例，如果输入 nums = [2,3,6,7]，和为 7 的组合应该有两种 [2,2,3] 和 [7]。
    //1.元素无重有复选，即 nums 中的元素都是唯一的，每个元素可以被使用若干次，i从start开始，
    /* 组合/子集问题回溯算法框架 */
/*    void backtrack(int[] nums, int start) {
        // 回溯算法标准框架,第一次进入的start元素不移除
        for (int i = start; i < nums.length; i++) {
            // 做选择
            track.addLast(nums[i]);
            // 注意参数
            backtrack(nums, i);
            // 撤销选择
            list.remove(list.size() - 1);
        }
    }*/
//2.排列问题，i从0开始
/* 排列问题回溯算法框架 */
/*
        void backtrack(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            // 做选择
            track.addLast(nums[i]);
            backtrack(nums);
            // 撤销选择,把最后一次加进来的数据重新弹出去
            list.remove(list.size() - 1);
        }
    }
*/

//    形式三、元素有重无复选，即 nums 中的元素可以存在重复，每个元素最多只能被使用一次。
//    以组合为例，如果输入 nums = [2,5,2,1,2]，和为 7 的组合应该有两种 [2,2,2,1] 和 [5,2]。
//    元素有重无复选，即 nums 中的元素可以存在重复，每个元素最多只能被使用一次，其关键在于排序和剪枝
/* 1.组合/子集问题回溯算法框架 */
/*  Arrays.sort(nums);先进行排序，让相同的元素靠在一起，如果发现 nums[i] == nums[i-1]，说明相同的元素是靠再一起的，那么就直接跳过，
    相当于将该树枝剪掉
    void backtrack(int[] nums, int start) {
        // 回溯算法标准框架
        for (int i = start; i < nums.length; i++) {
            // 剪枝逻辑，跳过值相同的相邻树枝
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            // 做选择
            track.addLast(nums[i]);
            // 注意参数
            backtrack(nums, i + 1);
            // 撤销选择
            list.remove(list.size() - 1);
        }
    }*/

/* 2.排列问题回溯算法框架 */
/*  Arrays.sort(nums);
    void backtrack(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            // 剪枝逻辑
            if (used[i]) {
                continue;
            }
            // 剪枝逻辑，固定相同的元素在排列中的相对位置
            //used[i - 1]==false前面的那个元素没有被用过
            // nums[i] == nums[i - 1] && !used[i - 1] 如果前面相邻且相等的元素没有被用过，则跳过
            // 当出现重复元素时，比如输入 nums = [1,2,2',2'']， 2'只有在2已经被使用的情况下才会被选择，如果2没被使用过，那么2'也不能被使用，
            // 同理，2'' 只有在 2' 已经被使用的情况下才会被选择。
            // used[i]保证元素没被使用过，used[i - 1]==false保证相同元素在排列中的相对位置固定
            if (i > 0 && nums[i] == nums[i - 1] && used[i - 1]==false) {
                continue;
            }
            // 做选择
            used[i] = true;
            track.addLast(nums[i]);
            backtrack(nums);
            // 撤销选择
            list.remove(list.size() - 1);
            used[i] = false;
        }
    }*/
//    但无论形式怎么变化，其本质就是穷举所有解，而这些解呈现树形结构，所以合理使用回溯算法框架，稍改代码框架即可把这些问题一网打尽。
}
