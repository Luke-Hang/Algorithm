package com.algorithm.binaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiehang
 * @create 2022-05-28 11:06
 * 二叉树的所有路径
 * https://leetcode.cn/problems/binary-tree-paths/
 */
public class N257 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, null, 5};
        List<String> strings = binaryTreePaths(TreeNodeUtils.arrayToTreeNode(arr));
        for (int i = 0; i < strings.size(); i++) {
            System.out.print(strings.get(i));
        }
    }


    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        getBinaryTreePaths(root, list, "");
        return list;
    }

    private static List<String> getBinaryTreePaths(TreeNode root, List<String> list, String Path) {
        if (root == null) {
            return list;
        }
        //先遍历左子树，后遍历右子树---在一个二叉树节点左子树都遍历完，即将开始遍历右子树的时候执行
        //此处采用中序遍历
        StringBuilder sb = new StringBuilder(Path);
        sb.append(root.val);
        if (root.left == null && root.right == null) {
            list.add(sb.toString());
        } else {
            sb.append("->");
            getBinaryTreePaths(root.left, list, sb.toString());
            getBinaryTreePaths(root.right, list, sb.toString());
        }
        return list;
    }
}
