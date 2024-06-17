package com.algorithm.od;

import java.util.Arrays;

/**
 * @author xiehang
 * @date 2022/12/30 10:54
 * 合并两个有序数组
 * https://leetcode.cn/problems/merge-sorted-array/
 */
public class N88 {
    public static void main(String[] args) {
       int[] nums1 = {1,2,3,0,0,0};
       int m=3;
       int[] nums2 = {2,5,6};
       int n=3;
        int[] merge = merge(nums1, m, nums2, n);
        for (int i : merge) {
            System.out.print(i);
        }
    }

    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        //从第m个元素开始，将nums2填充到nums1,将数组nums2放到数组nums1的尾部
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        //进行升序排序
        Arrays.sort(nums1);
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = nums1.length;
        while (n > 0) {
            if (m > 0 && nums1[m - 1] > nums2[n - 1]) {
                nums1[--i] = nums1[--m];
            } else {
                nums1[--i] = nums2[--n];
            }
        }
        return nums1;
    }
}
