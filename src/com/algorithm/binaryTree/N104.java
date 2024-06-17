package com.algorithm.binaryTree;

/**
 * @author xiehang
 * @create 2022-05-24 9:05
 * 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * 说明: 叶子节点是指没有子节点的节点。
 * https://leetcode.cn/problems/maximum-depth-of-binary-tree/
 */
public class N104 {
    public static void main(String[] args) {
        Integer[] arr = {3, 9, 20, null, null, 15, 7};
        TreeNode treeNode = TreeNodeUtils.arrayToTreeNode(arr);
        int depth = maxDepth(treeNode);
        System.out.println(depth);
    }

    /**
     * 节点为空时说明高度为 0，所以返回 0；节点不为空时则分别求左右子树的高度的最大值，同时加1表示当前节点的高度，返回该数值
     * 左子树和右子树的最大深度 left 和 right，那么该二叉树的最大深度即为max(left,right)+1--，同时加1表示当前节点的高度
     * 而左子树和右子树的最大深度又可以以同样的方式进行计算,所以只需要递归即可
     */
    public static int maxDepth(TreeNode root) {
        //你只需要单独思考每一个节点应该做什么
        //没一个节点在递归访问到空节点时退出
        //叶子节点是指没有子节点的节点。当root.left&&root.right都等于null的时候，该节点为叶子结点
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        //为什么要使用后序遍历
//        因为这个思路正确的核心在于，你确实可以通过子树的最大深度推导出原树的深度，
//        但是要首先利用递归函数的定义算出左右子树的最大深度，然后推出原树的最大深度，主要逻辑自然放在后序位置
        //当左右子树有一个为0时，最大路径也是1
        if (left == 0 || right == 0) {
            return 1 + left + right;
        } else {
            return Math.max(left, right) + 1;
        }
    }
}
