package com.algorithm.hashtable;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author xiehang
 * @create 2022-04-29 9:27
 * 202. 快乐数-编写一个算法来判断一个数 n 是不是快乐数
 * https://leetcode-cn.com/problems/happy-number/
 */
public class N202 {
    public static void main(String[] args) {
        int n=19;
        System.out.println(isHappy(n));
    }

    private static boolean isHappy(int n) {
        //HashSet保证数据过多造成的栈内存溢出
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = getNextNumber(n);
        }
        return n == 1;
    }

    /**
     * 计算该数字每个位置上的平方和
     *
     * @param n
     * @return
     */
    private static int getNextNumber(int n) {
        int sum = 0;
        while (n > 0) {
            //获取个位上的数字，168%10=8
            int x = n % 10;
            //除以10得到十位十位以前的数字，168/10=16,1/10=0;
            n = n / 10;
            //相当于8^2
            sum += x * x;
        }
        return sum;
    }
}