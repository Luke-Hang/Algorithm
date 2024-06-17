package com.algorithm.binaryTree;

/**
 * @author xiehang
 * @create 2022-05-29 23:24
 * 二叉树的镜像
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 * https://leetcode.cn/problems/er-cha-shu-de-jing-xiang-lcof/
 */
public class Offer27 {
    public static void main(String[] args) {
        Integer[] arr={4,2,7,1,3,6,9};
        TreeNode treeNode = TreeNodeUtils.arrayToTreeNode(arr);
        System.out.println(mirrorTree(treeNode));
    }

    public static TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        //确定终止条件--只考虑当前节点做什么
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        //其他的交给递归
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}
