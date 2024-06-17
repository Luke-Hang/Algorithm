package com.algorithm.Sort;

import java.util.Arrays;

/**
 * @author xiehang
 * @create 2022-03-15 21:19
 * 选择排序
 * 排序原理：
 * 1.每一次遍历的过程中，都假定第一个索引处的元素是最小值，和其他索引处的值依次进行比较，如果当前索引处
 * 的值大于其他某个索引处的值，则假定其他某个索引出的值为最小值，最后可以找到最小值所在的索引
 * 2.交换第一个索引处和最小值所在的索引处的值
 */
public class Selection {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 7, 9, 2, 10, 1};
        //剩余一个元素的时候，不需要选择，所以i< arr.length-1
        //此循环表示从哪个索引往后的元素参与排序
        for (int i = 0; i < arr.length - 1; i++) {//每次参与选择排序的元素都少一个，让i及其后面的元素参加排序，所以i++
            int minIndex = i;//每次遍历,都假定第一个索引处的元素值是最小值
            //此循环才是在数组中选择最小值
            for (int j = i + 1; j < arr.length; j++) {
                //默认第一个索引处的元素值是最小值，所以从下一个元素j+1开始找,最大索引是arr.length-1
                if (arr[minIndex] > arr[j]) {
                    //更换最小值所在的索引
                    minIndex = j;
                }
            }
            //交换i索引和minIdex索引对应的值
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
