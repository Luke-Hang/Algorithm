package algorithm.algorithm.dichotomy;

/**
 * @author xiehang
 * @create 2022-07-12 21:56
 * 35. 搜索插入位置
 * https://leetcode.cn/problems/search-insert-position/
 */
public class N35 {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 4;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                //nums[mid]大了，向左搜索
                right = mid - 1;
            } else if (nums[mid] < target) {
                //nums[mid]小了，向右搜所
                left = mid + 1;
            }
        }

/*            //检查 left 越界的情况
            if (left >= nums.length || nums[left] != target) {
                index=right+1;
                return index;
            }
            //检查 right 越界的情况
            if (right<0||nums[right]!=target){
                index=0;
                return index;
            }*/

        //1.目标值在数组所有元素之前,即在数组最左边时，有left=righ=mid=0时，target<nums[mid]成立，
        // right=mid-1=-1，[left,right]==[0,-1]

        //2.目标值插入数组中，当left=right时，target>nums[mid]成立，此时left=mid+1>right时,退出循环，
        // right+1就是left未+1

        // 3.1目标值在数组所有元素之前
        // 3.2 目标值插入数组中
        // 3.3 目标值在数组所有元素之后 return right + 1;
        return right + 1;
    }
}
