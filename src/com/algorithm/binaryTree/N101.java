package com.algorithm.binaryTree;

/**
 * @author xiehang
 * @create 2022-05-20 8:51
 * 对称二叉树
 * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
 * https://leetcode.cn/problems/symmetric-tree/
 */
public class N101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return check(root.left, root.right);
    }

    private boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        return check(p.left, q.right) && check(p.right, q.left);
    }
}
