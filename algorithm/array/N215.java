package algorithm.algorithm.array;

import java.util.*;

/**
 * @author xiehang
 * @date 2023/1/31 14:44
 * https://leetcode.cn/problems/kth-largest-element-in-an-array/
 */
public class N215 {
    public static void main(String[] args) {
//        int[] arr = {3, 2, 1, 5, 6, 4};
        int[] arr = {6,2,3,1,2,4,5,5,6};
        int k = 2;
        System.out.println(findKthLargest(arr, k));
    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
