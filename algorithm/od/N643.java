package algorithm.algorithm.od;

import java.awt.*;
import java.util.Arrays;

/**
 * @author xiehang
 * @date 2023/1/3 15:32
 */
public class N643 {
    public static void main(String[] args) {
        int[] nums={1,12,-5,-6,50,3};
        int k=4;
        System.out.println(findMaxAverage(nums,k));
    }
    public static double findMaxAverage(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        int index = nums.length - 1;
        while (k > 0) {
            sum += nums[--index];
            k--;
        }
        return sum;
    }
}
