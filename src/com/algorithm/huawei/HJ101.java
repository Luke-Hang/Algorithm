package com.algorithm.huawei;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author xiehang
 * @create 2022-04-18 22:18
 * 输入整型数组和排序标识，对其元素按照升序或降序进行排序
 * 第一行输入数组元素个数
 * 第二行输入待排序的数组，每个数用空格隔开
 * 第三行输入一个整数0或1。0代表升序排序，1代表降序排序
 */
public class HJ101 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int i = sc.nextInt();
        Arrays.sort(arr);

        if (i==0){
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j]+" ");
            }
        }else if (i==1){
            for (int j=arr.length-1; j>=0; j--) {
                System.out.print(arr[j]+" ");
            }
        }else {
            System.out.println("请输入0或1");
        }
    }
}
