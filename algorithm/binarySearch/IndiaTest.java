package algorithm.algorithm.binarySearch;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiehang
 * @date 2024/8/5 18:36
 */
public class IndiaTest {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 10};
        int target = 4;

        int left = 0;
        int rigth = nums.length - 1;
        List<Integer> list = new ArrayList<>();

        while (left <= rigth) {
            int mid = left + (rigth - left) / 2;
            if (nums[mid] < target) {
                //nums[mid]小了，向右搜索
                left = mid + 1;
            } else if (nums[mid] > target) {
                //nums[mid]大了，向左搜索
                rigth = mid - 1;
            } else if (nums[mid] == target) {
                list.add(mid);
                left++;
            }
        }
        if (list.size() == 0) {
            list.add(-1);
        }
        System.out.println(list);
    }
}
