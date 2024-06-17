package com.SortPractice1.test;

import com.SortPractice1.Buble01;

import java.util.Arrays;

/**
 * @author xiehang
 * @create 2022-03-15 9:02
 */
public class BubbleTest {
    public static void main(String[] args) {
        int[] arr={4,5,6,3,2,1};
//        Bublle.sort(arr);
        Buble01.buble01Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
