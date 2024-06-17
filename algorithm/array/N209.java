package algorithm.algorithm.array;

/**
 * @author xiehang
 * @date 2023/2/1 11:02
 * https://leetcode.cn/problems/minimum-size-subarray-sum/
 */
public class N209 {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(target, nums));
    }

    /**
     * 双指针
     */
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        result = (result == Integer.MAX_VALUE ? 0 : result);
        return result;
    }
}
