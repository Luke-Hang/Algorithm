package algorithm.algorithm.binarySearch;

/**
 * @author xiehang
 * @create 2022-03-05 18:09
 */
public class BinarySearchTemplate {
    // 二分查找框架
/*    分析二分查找的⼀个技巧是：不要出现 else，而是把所有情况用 else if 写清楚，这样可以清楚地展现所有细节
    left+(right-left)/2=left +right) / 2 的结果相同，但left + (right - left) / 2有效防止了left 和 right 太大直接相加导致溢出*/

    public static void main(String[] args) {
        int[] nums = {1, 3, 6, 8, 12};
        int target = 8;
        //二分查找
//        int index = binarySearch(nums, target);
        //使用递归进行二分查找
        int index = dfss(nums, target);
        //二分查找插入点
//        int index = binarySearchInsertionSimple(nums, target);
        System.out.println(index);
    }

    /**
     * 使用递归进行二分查找
     */
    private static int dfss(int[] nums, int target) {
        return dfsss(nums, target, 0, nums.length - 1);
    }


    /**
     * 使用递归进行二分查找
     */
    private static int dfsss(int[] nums, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (nums[mid] < target) {
            return dfsss(nums, target, mid + 1, right);
        } else if (nums[mid] > target) {
            return dfsss(nums, target, left, mid - 1);
        } else {
            return mid;
        }
    }

    /**
     * 二分查找框架
     * 分析二分查找的⼀个技巧是：不要出现 else，而是把所有情况用 else if 写清楚，这样可以清楚地展现所有细节
     * left+(right-left)/2 和 (left +right) / 2 的结果相同，
     * 但left + (right - left) / 2能有效防止了left 和 right 太大相加后溢出
     * 时间复杂度为 𝑂(log 𝑛) ：在二分循环中，区间每轮缩小一半，因此循环次数为 log2 𝑛 。
     * 空间复杂度为 𝑂(1) ：指针 𝑖 和 𝑗 使用常数大小空间。
     */
    private static int binarySearch(int[] nums, int target) {
        //搜索区间两端闭
        int left = 0;
        int right = nums.length - 1;

        // 循环，当搜索区间为空时跳出（当 left > right 时为空）
        while (left <= right) {
            //中点索引 mid
            int mid = left + (right - left) / 2;
            //元素已搜索到，发布会对应的索引
            if (nums[mid] > target) {
                right = mid - 1;//nums[mid]大了，向左搜索
            } else if (nums[mid] < target) {
                left = mid + 1;//nums[mid]小了，向右搜索
            } else {
                return mid;
            }

            //检查 left 越界的情况
            //left >= nums.length left最大是集合的最右边索引，left >= nums.length 就超过了最右边界
            //当nums[left] != target,也就是找到最左边也没有找到target，那就说明该数组中无target，返回-1
/*            if (left >= nums.length || nums[left] != target) {
                return -1;
            }
            return left;*/

            //检查 right 越界的情况
            //right < 0 right最小是索引0，小于索引0就超过了最左边界
            //当nums[right] != target,也就是找到最右边也没有找到target，那就说明该数组中无target，返回-1
/*            if (right < 0 || nums[right] != target) {
                return -1;
            }
            return right;*/
        }
        // 未找到目标元素，返回 -1
        return -1;
    }

    /**
     * 给定一个长度为 𝑛 的有序数组 nums 和一个元素 target ，数组不存在重复元素。现将 target 插入数组 nums 中，并保持其有序性。
     * 若数组中已存在元素 target ，则插入到其左方。请返回插入后 target在数组中的索引
     * 二分查找插入点（无重复元素）
     * <p>
     * 问题一：当数组中包含 target 时，插入点的索引是否是该元素的索引？
     * 题目要求将 target 插入到相等元素的左边，这意味着新插入的 target 替换了原来 target 的索引位置。也就是说，
     * 当数组包含 target 时，插入点的索引就是该 target 的索引。
     * <p>
     * 问题二：当数组中不存在 target 时，插入点是哪个元素的索引？
     * 当 nums[m] < target指针left 在向大于等于 target 的元素靠近，即left向右移动。
     * 当 nums[m] > target指针right 在向小于等于 target 的元素靠近，即right向左移动。
     * 因此二分循环结束时一定有： left指向首个大于 target 的元素(left = mid + 1)，
     * right指向首个小于 target 的元素(right = mid - 1)。
     * 因为left指向首个大于 target 的元素，此时返回left就相当于返回了刚好大于他的元素的索引，将元素插入到该位置，刚好可以是数组有序排列
     */
    private static int binarySearchInsertionSimple(int[] nums, int target) {
        //搜索区间两端闭
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            //中间索引mid
            int mid = left + (right - left) / 2;
            //nums小了，向右所搜
            if (nums[left] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                //nums大了，向左所搜
                right = mid - 1;
            } else {
                /**
                 *
                 * 问题一：当数组中包含 target 时，插入点的索引是否是该元素的索引？
                 *  题目要求将 target 插入到相等元素的左边，这意味着新插入的 target 替换了原来 target 的索引位置。也就是说，
                 *  当数组包含 target 时，插入点的索引就是该 target 的索引。
                 */
                // 找到 target ，返回插入点索引 mid
                return mid;
            }
        }
        /**
         *
         * 问题二：当数组中不存在 target 时，插入点是哪个元素的索引？
         *  当 nums[m] < target指针left 在向大于等于 target 的元素靠近，即left向右移动。
         *  当 nums[m] > target指针right 在向小于等于 target 的元素靠近，即right向左移动。
         *  因此二分循环结束时一定有： left指向首个大于 target 的元素(left = mid + 1)，
         *  right指向首个小于 target 的元素(right = mid - 1)。
         *  因为left指向首个大于 target 的元素，此时返回left就相当于返回了刚好大于他的元素的索引，
         *  将元素插入到该位置，刚好可以使数组有序排列，所以要插入元素的索引就是left.
         */
        // 未找到 target ，返回插入点 left
        return left;
    }
}
