package com.SortPractice1.test;

import com.SortPractice1.Insertion1;

import java.util.Arrays;

/**
 * @author xiehang
 * @create 2022-03-26 10:52
 */
public class InsertionTest {
    public static void main(String[] args) {
        int[] arr={4,3,2,10,12,1,5,6};
        Insertion1.Insertion1Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
