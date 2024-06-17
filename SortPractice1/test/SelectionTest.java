package com.SortPractice1.test;

import com.SortPractice1.Selection1;

import java.util.Arrays;

/**
 * @author xiehang
 * @create 2022-03-25 9:49
 */
public class SelectionTest {
    public static void main(String[] args) {
        int[] arr={4,6,8,7,9,2,10,1};
        Selection1.selection1Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
