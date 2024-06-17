package com.algorithm.dichotomy;

import java.util.Arrays;

/**
 * @author xiehang
 * @create 2022-07-27 9:25
 * 剑指 Offer 53 - II. 0～n-1中缺失的数字
 * https://leetcode.cn/problems/que-shi-de-shu-zi-lcof/
 */
public class Offer5302 {
    public static void main(String[] args) {
        int[] records = {0, 1, 2, 3, 4, 5, 6, 7, 9};
        System.out.println(takeAttendance(records));
    }


    public static int takeAttendance(int[] records) {
        int right = records.length;
        Arrays.sort(records);
        for (int i = 0; i < records.length; i++) {
            if (records[i] != i) {
                return i;
            }
        }
        //因为数组数字是0～n-1，当数组为空数组时，缺失数字只能是0，
        //且此时数组长度为0即right=0，返回right刚好
        return right;
    }
}
