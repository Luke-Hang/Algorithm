package algorithm.algorithm.binarySearch;

/**
 * @author xiehang
 * @create 2022-08-29 9:20
 * 剑指 Offer II 068. 查找插入位置
 * https://leetcode.cn/problems/N6YdxV/
 */
public class Offer02068 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
//        int target=5;
        int target = 2;
        int i = searchInsert(arr, target);
        System.out.println(i);

    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        //当target小于所有数值时，返回最左边索引
        //当target大于所有数值时，此时left的值为数组最后一个索引+1，直接返回即可
        return left;
    }
}
