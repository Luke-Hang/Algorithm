package algorithm.algorithm.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xiehang
 * @create 2022-03-31 9:01
 * 移除数组中的重复元素，不需要考虑数组中超出新长度后面的元素
 * https://leetcode-cn.com/problems/remove-element/
 */
public class N27 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
//        int[] nums = {2};
        int val = 2;
        int element = removeElement(nums, val);
        System.out.println(element);
    }

    /**
     * 在数组nums中移除所有数值等与val的元素
     * 双指针
     */
    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int slow = 0;
        int fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                //慢指针前进一步
                slow++;
            }
            //快指针前进一步
            fast++;
        }
        //数组中可以没有元素
        return slow;
    }
}
