package com.algorithm.binaryTree;

/**
 * @author xiehang
 * @create 2022-07-06 23:41
 * 剑指 Offer 55 - I. 二叉树的深度
 * 输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。
 */
public class Offer5501 {
    public static void main(String[] args) {
        Integer[] arr = {3, 9, 20, null, null, 15, 7};
        TreeNode treeNode = TreeNodeUtils.arrayToTreeNode(arr);
        int depth = maxDepth(treeNode);
        System.out.println(depth);
    }

    /**
     * 节点为空时说明高度为 0，所以返回 0；节点不为空时则分别求左右子树的高度的最大值，同时加1表示当前节点的高度，返回该数值
     * 当前节点左子树和右子树的最大深度如果是 left 和 right，那么该二叉树的最大深度即为max(left,right)+1--，加1表示当前节点的高度
     * 而左子树和右子树的最大深度又可以以同样的方式进行计算,所以只需要递归即可
     *
     * @param root
     * @return
     */
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // 而左子树和右子树的最大深度又可以以同样的方式进行计算,所以只需要递归即可
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        //当前节点左子树和右子树的最大深度如果是 left 和 right，那么该二叉树的最大深度即为max(left,right)+1
        //加1表示当前节点的高度
        if (left == 0 || right == 0) {
            return left + right + 1;
        } else {
            return Math.max(left, right) + 1;
        }
    }
}
