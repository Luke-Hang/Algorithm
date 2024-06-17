package com.algorithm.hashtable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author xiehang
 * @create 2022-04-28 9:53
 * https://leetcode.cn/problems/majority-element/
 * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。
 * 思路：采用哈希表，将nums中的元素作为key,出现的数量作为value相加，不同数据直接put到map中，并将value置为1，以备下次相加用
 * 相同数据，key还是自己，采用map.get(key)得到value也就是上次存的数量值，再+1就可以统计出本次数量，在put到map中
 */
public class N169 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = countNums(nums);
//        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        //定义一个Map.Entry<Integer,Integer>类型的entryMap
        Map.Entry<Integer, Integer> entryMap = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entryMap == null || entry.getValue() > entryMap.getValue()) {
                //不断更新entryMap大小，使其得到最大值
                entryMap = entry;
            }
        }
        //返回entryMap拿到数量最多的数据，也就是key
        return entryMap.getKey();
    }

    /**
     * 统计nums集合中不同数字出现的次数
     */
    private static Map<Integer, Integer> countNums(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        return map;
    }
}
