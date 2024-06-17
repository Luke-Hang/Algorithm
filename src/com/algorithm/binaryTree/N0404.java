package com.algorithm.binaryTree;

/**
 * @author xiehang
 * @create 2022-07-11 9:31
 * 面试题 04.04. 检查平衡性
 * https://leetcode.cn/problems/check-balance-lcci/
 */
public class N0404 {
    public static void main(String[] args) {
//        Integer[] arr={3,9,20,null,null,15,7};
        Integer[] arr = {1, 2, 2, 3, 3, null, null, 4, 4};
        TreeNode treeNode = TreeNodeUtils.arrayToTreeNode(arr);
        System.out.println(isBalanced(treeNode));
    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            //二叉树任意节点最大左子树最大深度与右子树最大深度<=1,那么其子树节点绝对值差必然小于1
            //1.当前节点左右子树的高度差不超过1--------------------------Math.abs(helper(root.left) - helper(root.right)) <= 1
            //2.递归遍历当前节点左右子节点，判断左子树和右子树是否平衡------isBalanced(root.left) && isBalanced(root.right)
            boolean flag1 = Math.abs(height(root.left) - height(root.right)) <= 1;
            boolean flag2 = isBalanced(root.left) && isBalanced(root.right);
            return flag1 && flag2;
        }
    }


    /**
     * 求二叉树最大深度方法
     */
    private static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left, right) + 1;
    }
}
