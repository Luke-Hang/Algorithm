package com.algorithm.dichotomy;

/**
 * @author xiehang
 * @create 2022-08-29 11:39
 * 剑指 Offer II 072. 求平方根
 * https://leetcode.cn/problems/jJ0w9p/
 */
public class Offer02072 {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));
    }

    /**
     * 取中间值作为计算平方的值，x的平方根就是mid，所以mid*mid就是x，所以需要把mid*mid与x作比较
     * x<mid*mid容易出现整数溢出，所以用x/mide<mid代替-----8<3*3===8/3<3
     */
    public static int mySqrt(int x) {
        int left = 1;
        int right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            //说明mid大了，数组向左收缩
            if (x / mid < mid) {
                right = mid - 1;
            } else if (x / mid > mid) {
                //说明mid小了，数组向右收缩
                left = mid + 1;
            } else {
                return mid;
            }
        }
        //如果是自己，返回其本身，比如1
        return right;
    }
}
