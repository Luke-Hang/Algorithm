package com.algorithm.binaryTree;

/**
 * @author xiehang
 * @create 2022-05-27 9:02
 * 给你二叉树的根节点root 和一个表示目标和的整数targetSum 。判断该树中是否存在根节点到叶子节点的路径，
 * 这条路径上所有节点值相加等于目标和targetSum 。如果存在，返回 true ；否则，返回 false 。
 * https://leetcode.cn/problems/path-sum/
 */
public class N112 {
    public static void main(String[] args) {
        Integer[] arr={5,4,8,11,null,13,4,7,2,null,null,null,1};
        int targetSum=22;
        TreeNode root = TreeNodeUtils.arrayToTreeNode(arr);
        System.out.println(hasPathSum(root,targetSum));
    }

    //只考虑当前节点要做什么
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        //当前节点未空
        if (root==null){
            return false;
        }
        //当前节点为叶子结点
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }
        //targetSum-root.val 当前目标值,当前目标值-当前节点的值=该节点左子树或右子树的结点值的和
        return hasPathSum(root.left, targetSum-root.val)||hasPathSum(root.right, targetSum-root.val);
    }
}
