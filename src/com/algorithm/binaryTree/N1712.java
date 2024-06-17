package com.algorithm.binaryTree;

/**
 * @author xiehang
 * @create 2022-07-11 10:24
 * 二叉搜索树转换为单向链表
 * https://leetcode.cn/problems/binode-lcci/
 * 二叉树数据结构TreeNode可用来表示单向链表（其中left置空，right为下一个链表节点）。实现一个方法，把二叉搜索树转换为单向链表，
 * 要求依然符合二叉搜索树的性质，转换操作应是原址的，也就是在原始的二叉搜索树上直接修改。
 */
public class N1712 {
    /**
     * 定义当前节点
     */
    TreeNode currNode;
    public static void main(String[] args) {
       Integer[] arr={4,2,5,1,3,null,6,0};
        TreeNode treeNode = TreeNodeUtils.arrayToTreeNode(arr);
    }

    /**
     * 思路：当做链表一样
     */
    public TreeNode convertBiNode(TreeNode root) {
        //创建当前节点指针
        currNode=new TreeNode(0);
        //指针放到前一个节点处
        TreeNode pre=currNode;
        Dfs(root);
        //前一个节点的右子树就是我们需要的链表
        return pre.right;
    }

    private void Dfs(TreeNode root) {
        if (root==null){
            return;
        }
        //遍历左子树
        Dfs(root.left);
        //遍历根节点
        //currNode的右节点指向当前节点,相当于把当前节点连接到currNode上
        currNode.right=root;
        //currNode指针前进一步
        currNode=currNode.right;
        //当前节点左节点置位null
        root.left=null;
        //遍历右子树
        Dfs(root.right);
    }
}

