package com.algorithm.dichotomy;

import com.sun.org.apache.regexp.internal.REUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiehang
 * @create 2022-07-19 22:16
 * 指 Offer 53 - I. 在排序数组中查找数字 I
 * https://leetcode.cn/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/
 * 统计一个数字在排序数组中出现的次数。
 */
public class Offer5301 {
    public static void main(String[] args) {
        int[] scores={2, 2, 3, 4, 4, 4, 5, 6, 6, 8};
        int target = 4;

        System.out.println(search1(scores, target));
        System.out.println(search2(scores, target));
    }

    /**
     * 解法一
     * @param nums
     * @param target
     * @return
     */
    public static int search1(int[] scores, int target) {
        int left = 0;
        int right = scores.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (scores[mid] < target) {
                left = mid + 1;
            } else if (scores[mid] > target) {
                right = mid - 1;
            } else {
                //到这个到最后的else{ } 里面，就代表已经找到了第一次出现target=nums[mid]的位置
                //相当于他找的是那个区间,左右边界不断逼近target位置的那几个下标
                // 左边界从左不断逼近target下标，left不断++， 当左边界到达nums[left] = target时左边界left停止++
                // 右边界从右不断逼近target下标，right不断-- 当右边界到达nums[right] = target时右边界right停止--
                // 所以当nums[right] == target && nums[left] == target，break跳出循环
                // 找出来的集合是[8,8,8],那么右下标right=4，左下标left=2，right-left+1就是target在有序数组中出现的次数
                // 【1，2，3，3，4，5】找到target 在mid=2的位置，然后hi，lo不断逼近这个区间，最终这个区间是 -->[ 3, 3 ]，
                if (scores[right] != target) {//从右向左逼近，直至找到最右边等于target的元素
                    right--;
                } else if (scores[left] != target) {//从左向右逼进，直至找到最左边等于target的元素
                    left++;
                } else {
                    // 此时就找到了最左边=target的元素，即nums[left] == target 和最右边=target的元素即nums[left] == target，
                    // break跳出循环
                    break;
                }
            }
        }
        //那么最右边索引减去最左边索引就是target出现的次数，右索引-左索引
        return right - left + 1;
    }

    /**
     * 解法二
     * @param nums
     * @param target
     * @return
     */
    public static int search2(int[] scores, int target) {
        int count=0;
        for (int num : scores) {
            if (num==target){
                count++;
            }
        }
        return count;
    }
}
