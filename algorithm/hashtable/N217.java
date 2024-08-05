package algorithm.algorithm.hashtable;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xiehang
 * @create 2022-05-18 22:45
 * https://leetcode.cn/problems/contains-duplicate/
 */
public class N217 {
    public static void main(String[] args) {
//        int[] nums={1,2,3,1};
        int[] nums = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums));
    }

    /**
     * 解法二
     */
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        //当HashSet中没有该元素时，元素被add到HashSet，并返回true
        //当HashSet中有该元素时，元素不会被add到HashSet，并且返回false
        for (int i = 0; i < nums.length; i++) {
            //如果任一值在数组中出现至少两次,返回true，set中无法加入该元素，说明该元素在数组中存在2次，所以返回true
            if (!set.add(nums[i])) {
                return true;
            }
        }
        //数组为空，默认返回false
        return false;
    }

    /**
     * 解法二
     * @param nums
     * @return
     */
//    public static boolean containsDuplicate(int[] nums) {
//        Set<Integer> set=new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            set.add(nums[i]);
//        }
//        if (set.size()<nums.length){
//            return true;
//        }else {
//            return false;
//        }
//    }
}

