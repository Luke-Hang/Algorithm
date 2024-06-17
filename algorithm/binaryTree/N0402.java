package algorithm.algorithm.binaryTree;

/**
 * @author xiehang
 * @create 2022-07-11 8:35
 * 面试题 04.02. 最小高度树
 * https://leetcode.cn/problems/minimum-height-tree-lcci/
 * 思路：
 * 题目给的是一个升序数组且需要构建二叉搜索树，我们知道二叉搜索树的左右平衡时高度最小。
 * 如果想要左右平衡可以让根节点是排序数组的中点，这样左边有x个右边也约有x个，大致保持一致。
 *
 */
public class N0402 {
    public static void main(String[] args) {
       int[] arr={0,1,2};
       System.out.println(sortedArrayToBST(arr));
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length);
    }

    private static TreeNode helper(int[] nums, int left, int right) {
        //判断条件是if(left==right)那么搜索区间就是[left,right)
        //此为递归结束条件
        if (left==right) {
            return null;
        }
        int mid=left+(right-left)/2;
        //取有序数组中间值作为根节点，mid=1
        TreeNode root=new TreeNode(nums[mid]);
        //此处传的left还是0，代表新数组最左边的元素索引
        //判断条件是if(left==right)那么搜索区间就是[0,mid)
        root.left=helper(nums, left, mid);
        //判断条件是if(left==right)那么搜索区间就是[2,2)
        root.right=helper(nums, mid+1, right);
        return root;
    }
}
