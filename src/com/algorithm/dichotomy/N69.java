package com.algorithm.dichotomy;

/**
 * @author xiehang
 * @create 2022-07-13 9:41
 * 69. x 的平方根
 * https://leetcode.cn/problems/sqrtx/
 */
public class N69 {
    public static void main(String[] args) {
        int x = 1;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        int left = 1;
        int right = x;
        while (left <= right) {
            //取中间值作为计算平方的值，x的平方根就是mid，所以mid*mid就是x，所以需要把mid*mid与x作比较
            // x<mid*mid容易出现整数溢出，所以用x/mide<mid代替-----8<3*3===8/3<3
            int mid = left + (right - left) / 2;
            //即mid^2>x，mid大了，数组向左收缩
            if (x / mid < mid) {
                right = mid - 1;
            } else if (x / mid > mid) {
                //说明mid小了，数组向右收缩
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return right;
    }
}
