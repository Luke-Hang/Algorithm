package algorithm.algorithm.array.leetCode;

/**
 * @author xiehang
 * @create 2022-12-13 15:01
 *
 * You are given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * https://leetcode.cn/problems/two-sum/
 * https://leetcode.com/problems/two-sum/description/
 */
public class N01 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 18;
        int[] ints = twoSum(arr, target);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);

        }
    }

    /**
     * 暴力枚举：检查每一对不同的元素，适用于无序数组。
     * 时间复杂度 O(n²)，额外空间复杂度 O(1)。
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            // 从 i + 1 开始，避免重复使用同一个元素，也避免重复检查。
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("不存在满足条件的两个数");
    }

    /**
     * 双指针：仅适用于升序数组。
     */
    public static int[] twoSumSorted(int[] nums, int target) {
        //存放目标数组
        int[] res = new int[2];
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                res[0] = left;
                res[1] = right;
                break;
            } else if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            }
        }
        return res;
    }
}
