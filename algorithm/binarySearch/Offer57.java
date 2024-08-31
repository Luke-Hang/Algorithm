package algorithm.algorithm.binarySearch;

import java.util.Arrays;

/**
 * @author xiehang
 * @create 2022-07-27 9:51
 * 剑指 Offer 57. 和为s的两个数字
 * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。
 * https://leetcode.cn/problems/he-wei-sde-liang-ge-shu-zi-lcof/
 */
public class Offer57 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] array = twoSum(nums, target);
        System.out.println(Arrays.toString(array));
    }

    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            //数组是递增排序的，当最左边数字+最右边数字<target,说明左边数字偏小，需要向右搜索较大的数据，所以左索引++
            if (nums[left] + nums[right] < target) {
                left++;
            } else if (nums[left] + nums[right] > target) {
                //数组是递增排序的，当最左边数字+最右边数字>target,说明右边数字偏大，需要向左搜索较小的数据，右边索引需要--
                right--;
            } else {
                //当最左边数字+最右边数字==target,说明找到了正确的数据,将数据返回即可
                return new int[]{nums[left], nums[right]};
            }
        }
        //没有满足的数据，返回空数组
        return new int[]{};
    }
}
