package algorithm.algorithm.dichotomy;

import java.util.Arrays;

/**
 * @author xiehang
 * @create 2022-07-27 23:15
 * 剑指 Offer II 006. 排序数组中两个数字之和
 * https://leetcode.cn/problems/kLl5u1/
 */
public class Offer02006 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6, 10};
        int tartget = 8;
        int[] ints = twoSum(nums, tartget);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            if (numbers[left] + numbers[right] < target) {
                left++;
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                return new int[]{left, right};
            }
        }
        return new int[]{};
    }
}
