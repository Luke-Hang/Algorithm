package algorithm.algorithm.od;

import java.util.Arrays;

/**
 * @author xiehang
 * @date 2023/1/3 10:14
 * 最长和谐子序列
 * https://leetcode.cn/problems/longest-harmonious-subsequence/
 */
public class N594 {
    public static void main(String[] args) {
        int[] nums={1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));
    }

    public static int findLHS(int[] nums) {
        Arrays.sort(nums);
//        [1, 2, 2, 2, 3, 3, 5, 7]
        int start = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int end = i;
            if (nums[end] - nums[start] > 1) {
                start++;
            }
            if (nums[end] - nums[start] == 1) {
                //开始索引-结束索引+1=数组长度
                res = Math.max(res, end - start + 1);
            }
        }
        return res;
    }
}
