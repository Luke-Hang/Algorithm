package algorithm.algorithm.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author xiehang
 * @create 2022-03-29 22:07
 * 删除有序数组中的重复项
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 */
public class N26 {
    public static void main(String[] args) {
//        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums = {1, 1, 2};
        System.out.println(removeDuplicates(nums));
        System.out.println(removeDuplicates2(nums));
    }

    /**
     * 解法一
     * 双指针
     */
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int slow = 0;
        int fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != nums[slow]) {
                //将该元素nums[fast]放到nums里面，维护 nums[0..slow] 元素⽆重复
                slow++;
                nums[slow] = nums[fast];
            }
            //快指针前进一步
            fast++;
        }
        //数组中至少有一个元素
        return slow + 1;
    }

    /**
     * 解法二
     * @param nums
     * @return
     */
    public static int removeDuplicates2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        return set.toArray().length;
    }
}
