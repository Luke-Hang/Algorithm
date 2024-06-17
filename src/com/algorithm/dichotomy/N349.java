package com.algorithm.dichotomy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author xiehang
 * @create 2022-07-17 19:06
 * https://leetcode.cn/problems/intersection-of-two-arrays/
 * 两个数组的交集
 */
public class N349 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] intersection = intersection(nums1, nums2);
        for (int i : intersection) {
            System.out.println(i);
        }
    }

    /**
     * 1.将nums1元素加入set1集合
     * 2.判断nums2中的元素是否在set中，如果在就是我们要的有交集的数据，加入set2中
     * 3.以set2的size作为数组长度。新建数组arr
     * 4.将set2集合中的值赋给数组arr
     */
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        //1.将nums1元素加入set1集合
        for (Integer num : nums1) {
            set1.add(num);
        }

        //2.判断nums2中的元素是否在set1中，如果在就是我们要的有交集的数据，加入set2中
        for (Integer num : nums2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }
        //3.以set2的size作为数组长度。新建数组arr
        int[] arr = new int[set2.size()];
        //4.将set2集合中的值赋给数组arr
        int index = 0;
        for (Integer integer : set2) {
            arr[index] = integer;
            index++;
        }
        return arr;
    }
}
