package com.algorithm.array;

/**
 * @author xiehang
 * @date 2023/1/31 11:01
 * https://leetcode.cn/problems/container-with-most-water/
 * 盛最多水的容器
 */
public class N11 {
    public static void main(String[] args) {
//        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] height = {1, 1};
        System.out.println(maxArea(height));
    }

    /**
     * 双指针
     */
    public static int maxArea(int[] height) {
        //left 和right表示横坐标索引,即容器长度
        int left = 0;
        int right = height.length - 1;
        int res = 0;
        while (left < right) {
            //Math.min(height[left],height[right])查找能使纵坐标最短的数据，即木桶原理，查找最短板，表示高度
            //right - left表示纵坐标长度，即理解为底长
            int area = (right - left) * Math.min(height[left], height[right]);//长*宽
            res = Math.max(res, area);
            //通俗易懂的理解，把两边单做木板中间的是水，一根木板向另一个根木板移动，那么移动的木板至少要变更长水才不会溢出，
            // 所以移动更短的那一根变长才可能装比原来更多的水，即左边left要越来越大
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return res;
    }
}
