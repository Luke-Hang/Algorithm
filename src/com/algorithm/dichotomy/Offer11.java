package com.algorithm.dichotomy;

/**
 * @author xiehang
 * @create 2022-07-18 22:42
 * 剑指 Offer 11. 旋转数组的最小数字
 * https://leetcode.cn/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/
 */
public class Offer11 {
    public static void main(String[] args) {
        int[] numbers  = {3,4,5,1,2};
        System.out.println(minArray(numbers));
    }

    public static int minArray(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            //说明从中间数numbers[mid]开始向右都是有序的，那么最小数就在这个有序数组左边，即在mid前
            if (numbers[mid] < numbers[high]) {
                //向左寻找最小数
                high = mid;
            } else if (numbers[mid] > numbers[high]) {
                //说明中间数numbers[mid]左边是一个有序数组，那么最小数在这个有序数组后面，即在mid后
                //向右搜索
                low = mid + 1;
            } else {
                //中间数等于数组最后一位，那么mid必定不是最小数组，最小数字不可能有2个，此时从右向左配合二分法暴力查找
                high--;
            }
        }
        //当只有一位数时，返回最左边数据
        return numbers[low];
    }
}
