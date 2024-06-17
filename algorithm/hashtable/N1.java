package algorithm.algorithm.hashtable;

import jdk.nashorn.internal.ir.IfNode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xiehang
 * @create 2022-04-27 9:03
 * 两数之和-数组中同一个元素在答案里不能重复出现
 * https://leetcode-cn.com/problems/two-sum/
 */
public class N1 {
    public static void main(String[] args) {
        int[] nums={3,2,4};
        int target=6;
        int[] ints = twoSum(nums, target);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    /**
     * 解法二
     */
    private static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            //如果map中找到差值，说明此差值和当前元素相加等于目标元素
            if (map.containsKey(key)){
                //map.get(key)获取差值元素对应的索引
                Integer n = map.get(key);
                return new int[]{n,i};
            }else {
                //将元素值作为key,索引作为value
                map.put(nums[i], i);
            }
        }
        //没有找到，返回空数组
        return new int[0];
    }


    /**
     * 解法一
     * @param nums
     * @param target
     * @return
     */
//    public static int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            //数组中同一个元素在答案里不能重复出现,即不能出现3+3，所以索引从0开始
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i]+nums[j]==target){
//                    return new int[] {i,j};
//                }
//            }
//        }
//        return new int[0];
//    }
}
