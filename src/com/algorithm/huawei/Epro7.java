package com.algorithm.huawei;

/**
 * @author xiehang
 * @date 2023/4/17 14:45
 * 键盘输入6个正整数，第一个数与后面5个比较，输出比它小的所有数字之和
 * 例如输入10 1 2 3 4 12
 * 输出10
 */
public class Epro7 {
    public static void main(String[] args) {
        int[] arr = {10, 1, 2, 3, 4, 12};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] > arr[i]) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
