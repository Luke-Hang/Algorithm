package algorithm.algorithm.dichotomy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author xiehang
 * @create 2022-07-17 15:10
 * 268. 丢失的数字
 * https://leetcode.cn/problems/missing-number/
 */
public class N268 {
    public static void main(String[] args) {
        int[] nums={9,6,4,2,3,5,7,0,1};
        //解法一
        System.out.println(missingNumber1(nums));
        //解法二
        System.out.println(missingNumber1(nums));
    }

    /**解法一
     * 1.先把数组按从小到大排序
     * 2.正常情况数组索引和数组值应该相等
     * 当数组值和数组索引不相等时，数组索引就是没包含的值
     * nums[0]=0,nums[1]=1;
     * @param nums
     * @return
     */
    public static int missingNumber1(int[] nums) {
        int right = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < right; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        //因为数组数字是0～n-1，当数组为空数组时，缺失数字只能是0，
        //且此时数组长度为0即right=0，返回right刚好
        return right;
    }

    /**
     * 解法二:数列解法，哈希表
     * @param nums
     * @return
     */
    public static int missingNumber2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}
