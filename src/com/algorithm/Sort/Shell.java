package com.algorithm.Sort;

import java.util.Arrays;

/**
 * @author xiehang
 * @create 2022-03-16 22:30
 * 希尔排序
 */
public class Shell {
    public static void main(String[] args) {
        int[] arr = {9,1,2,5,7,4,8,6,3,5} ;

        //1.根据数组arr的长度，确定增长量h的初始值，
        // 以下是固定规则，当h<arr.length/2的时候，h=2*h+1
        int h=1;
        while (h<arr.length/2){
            h=2*h+1;
        }
        //2.希尔排序,增长量h最小值为1,当增长量h小于1，排序结束
        while (h>=1){
            //排序
            //2.1找到待插入的元素,a[i]就是待插入的元素，第一个待插入的值就是以h为索引的值,最大待插入索引是arr.length-1,所以i < arr.length
            //这样就找到了每一个待插入元素
            for (int i = h; i < arr.length; i++) {
                //2.2把待插入的元素插入到有序数列中
                //j = i所以j索引处的值就是待插入元素，j的临界值就是h所以j-h>=0;
                //把arr[i]插入到arr[i-h],arr[i-2h],arr[i-3h]...序列中,所以依次要和索引arr[i-h],arr[i-2h],arr[i-3h]作比较，所以每次j-=h
                //arr[j]就是待插入元素，依次和arr[i-h],arr[i-2h],arr[i-3h]进行比较，如果a[j]小，那么交换位置，如果不小于，a[j]大，则插入完成。
                for (int j = i; j >=h ; j-=h) {
                    int temp;
                    if (arr[j-h]>arr[j]){
                        temp=arr[j-h];
                        arr[j-h]=arr[j];
                        arr[j]=temp;
                    }else{
                        break;
                    }
                }
            }
            //排序完成后，减小h的值，让h=h/2;
            h=h/2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
