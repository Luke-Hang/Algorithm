package com.algorithm.array;

/**
 * @author xiehang
 * @date 2023/1/31 12:06
 * https://leetcode.cn/problems/move-zeroes/
 */
public class N283 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes3(nums);
    }

    public static int[] moveZeroes(int[] nums) {
        //第一次遍历的时候，rigth指针记录非0的个数，只要是非0的统统都赋给nums[rigth]
        int right=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[right]=nums[i];
                right++;
            }
        }
        //非0元素统计完了，剩下的都是0了
        //所以第二次遍历把末尾的元素都赋为0即可
        for (int i = right; i < nums.length; i++) {
            nums[i]=0;
        }
        return nums;
    }

    public static int[] moveZeroes2(int[] nums) {
        //两个指针left和rigth
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            //当前元素!=0，就把其交换到左边，等于0的交换到右边
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
        return nums;
    }

    public static int[] moveZeroes3(int[] nums) {
        //两个指针left和rigth
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
            right++;
        }
        return nums;
    }
}
