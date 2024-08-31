package algorithm.algorithm.binarySearch;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiehang
 * @date 2024/8/5 18:36
 */
public class India {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 10};
        int target = 4;

        int left = 0;
        int rigth = nums.length - 1;
        List<Integer> list = new ArrayList<>();

        while (rigth >= left) {
            int mid = left + (rigth - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
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
