package algorithm.algorithm.binaryTree;

/**
 * @author xiehang
 * @create 2022-05-25 9:09
 * 将有序数组转换为二叉搜索树
 * https://leetcode.cn/problems/convert-sorted-array-to-binary-search-tree/
 */
public class N108 {
    public static void main(String[] args) {
        int[] nums={-10,-3,0,5,9};
        TreeNode treeNode = sortedArrayToBST(nums);
        System.out.println(treeNode);
    }


    public static TreeNode sortedArrayToBST(int[] nums) {
        TreeNode treeNode = ArrayToBST(nums, 0, nums.length - 1);
        return treeNode;
    }

    /**
     * 利用每一个节点构建二叉树
     */
    private static TreeNode ArrayToBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        //获取数组中间索引
        int mid=left+(right-left)/2;
        //只需要单独思考每一个节点应该做什么
        //当前节点构建二叉树------利用每一个节点创建二叉树
        TreeNode root=new TreeNode(nums[mid]);
        //左子树
        root.left=ArrayToBST(nums,left,mid-1);
        //右子树
        root.right=ArrayToBST(nums, mid+1, right);
        return root;
    }
}
