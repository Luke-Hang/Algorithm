package algorithm.algorithm.binaryTree.leetCode;

import java.util.ArrayList;
import java.util.List;
import algorithm.algorithm.binaryTree.TreeNode;
import algorithm.algorithm.binaryTree.TreeNodeUtils;

/**
 * @author xiehang
 * @create 2022-05-28 9:36
 * 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 * https://leetcode.cn/problems/binary-tree-preorder-traversal/
 */
public class N144 {
    public static void main(String[] args) {
        Integer[] arr={1,null,2,3};
        TreeNode root = TreeNodeUtils.arrayToTreeNode(arr);
        System.out.println(preorderTraversal(root));

    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        getPreorderTraversal(root,list);
        return list;
    }

    /**
     *
     */
    private static void getPreorderTraversal(TreeNode root, List<Integer> list) {
        //结束条件--递归终止的条件为碰到空节点
        if (root == null) {
            return;
        }
        //根节点
        list.add(root.val);
        //左节点
        getPreorderTraversal(root.left, list);
        //右节点
        getPreorderTraversal(root.right, list);
    }
}
