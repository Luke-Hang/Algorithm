package com.SortPractice1.test;

import com.algorithm.Sort.Merge;

import java.util.Arrays;

/**
 * @author xiehang
 * @create 2022-03-18 0:39
 */
public class MergeTest {
    public static void main(String[] args) {
        int[] arr = {8, 4, 5, 7, 1, 3, 6, 2};
        Merge.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
