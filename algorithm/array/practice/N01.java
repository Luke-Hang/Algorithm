package algorithm.algorithm.array.practice;

import java.util.ArrayList;
import java.util.List;

// Count elements to the left that are strictly smaller than the current element.
// Input: [8, 1, 3, 4, 6], output: [0, 0, 1, 2, 3].
// 给定一个整数数组，统计每个元素左侧有多少个元素比它小，并按原数组的顺序返回这些数量。
public class N01 {
    public static void main(String[] args) {
        Integer[] arr = {8, 1, 3, 4, 6};

        List<Integer> list = new ArrayList();

        //外层循环：依次取出当前元素。
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            //内层循环：遍历当前元素左边的所有元素，判断是否比当前元素小。
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
            list.add(count);
        }
        System.out.println(list);
    }
}
