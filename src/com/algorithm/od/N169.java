package com.algorithm.od;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiehang
 * @create 2022-12-28 15:43
 * 数元素
 * https://leetcode.cn/problems/majority-element/
 */
public class N169 {
    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    public  static int majorityElement(int[] nums) {
        //统计数组中每个元素出现的个数
        Map<Integer, Integer> counts = countNums(nums);
        Map.Entry<Integer, Integer> majorityEntry=null;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }
        return majorityEntry.getKey();

    }

    /**
     * 统计数组中每个元素出现的个数
     * @param nums
     * @return
     */
    private static Map<Integer, Integer> countNums(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                //该元素不存在，则将该元素存入map中，并将其次数置为2
                map.put(num, 1);
            } else {
                //map中存在该元素，则将该元素出现的次数value+1
                map.put(num, map.get(num) + 1);
            }
        }
        return map;
    }
}
