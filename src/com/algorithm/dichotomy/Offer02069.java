package com.algorithm.dichotomy;

/**
 * @author xiehang
 * @create 2022-08-29 11:03
 * https://leetcode.cn/problems/B1IidL/
 * 剑指 Offer II 069. 山峰数组的顶部
 */
public class Offer02069 {
    public static void main(String[] args) {
        int[] arr={1,3,5,4,2};
//        int index = peakIndexInMountainArray(arr);
        int index = peakIndexInMountainArray2(arr);
        System.out.println(index);
    }

    /**
     * 解法一
     * @param arr
     * @return
     */
    public static int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        //假设索引为0的数据是最大数字
        int ans=0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            //说明需要查找的数字在mid左边，数组向左收缩
            if (arr[mid] > arr[mid + 1]) {
                //更新最大数字索引
                ans=mid;
                right=mid-1;
            }else {
                //说明需要查找的数字在mid右边，数组向右收缩
                left=mid+1;
            }
        }
        return ans;
    }

    /**
     * 解法二
     * @param arr
     * @return
     */
    public static int peakIndexInMountainArray2(int[] arr) {
        //假设最左边元素是最大数值
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            //更新最大元素索引
            if (arr[i]>arr[i+1]){
                ans=i;
                break;
            }
        }
        return ans;
    }

}
