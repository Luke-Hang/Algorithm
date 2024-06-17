package com.algorithm.dichotomy;

/**
 * @author xiehang
 * @create 2022-03-05 18:09
 */
public class BinarySearchTemplate {
    // 二分查找框架
/*    分析二分查找的⼀个技巧是：不要出现 else，而是把所有情况用 else if 写清楚，这样可以清楚地展现所有细节
    left+(right-left)/2=left +right) / 2 的结果相同，但left + (right - left) / 2有效防止了left 和 right 太大直接相加导致溢出*/
/*    int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;//搜索区间两端闭。
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;//搜索一个元素时
            } else if (nums[mid] > target) {
                right = mid - 1;//固定target,nums[mid]大了，向左搜索
            } else if (nums[mid] < target) {
                left = mid + 1;;//固定target,nums[mid]小了，向右搜所
            }

            return -1;//搜索一个元素时

            //检查 left 越界的情况
            //left >= nums.length left最大是集合的最右边索引，left >= nums.length 就超过了最右边界
            //当nums[left] != target,也就是找到最左边也没有找到target，那就说明该数组中无target，返回-1
            if (left >= nums.length || nums[left] != target) {
                return -1;
            }
            return left;

            //检查 right 越界的情况
            //right < 0 right最小是索引0，小于索引0就超过了最左边界
            //当nums[right] != target,也就是找到最右边也没有找到target，那就说明该数组中无target，返回-1
            if (right < 0 || nums[right] != target) {
                return -1;
            }
            return right;
        }
        return 0;
    }*/
}
