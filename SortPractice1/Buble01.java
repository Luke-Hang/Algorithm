package com.SortPractice1;

/**
 * @author xiehang
 * @create 2022-03-24 8:59
 */
public class Buble01 {

    public static void buble01Sort(int[] arr) {
        for (int i = arr.length-1; i >0; i--) {
            int temp;
            for (int j = 0; j < i; j++) {
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
