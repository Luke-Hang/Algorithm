package com.algorithm.binaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiehang
 * @create 2022-05-28 9:50
 * 二叉树的后序遍历
 * 给你一棵二叉树的根节点 root ，返回其节点值的 后序遍历 。
 * https://leetcode.cn/problems/binary-tree-postorder-traversal/
 */
public class N145 {
    public static void main(String[] args) {
        Integer[] arr={1,null,2,3};
        TreeNode root = TreeNodeUtils.arrayToTreeNode(arr);
        postorderTraversal(root);
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        getPostorderTraversal(root,list);
        return list;
    }

    private static void getPostorderTraversal(TreeNode root, List<Integer> list) {
        ///结束条件--递归终止的条件为碰到空节点
        if (root==null){
            return;
        }
        //左节点
        getPostorderTraversal(root.left, list);
        //右节点
        getPostorderTraversal(root.right, list);
        //根节点
        list.add(root.val);
    }
}