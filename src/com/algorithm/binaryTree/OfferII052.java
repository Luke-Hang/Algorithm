package com.algorithm.binaryTree;

/**
 * @author xiehang
 * @create 2022-07-07 9:41
 * 剑指 Offer II 052. 展平二叉搜索树
 * https://leetcode.cn/problems/NYBBNL/
 */
public class OfferII052 {

    //新建一个节点
    TreeNode res = new TreeNode(0);
    //新建节点指向结果节点
    TreeNode currNode = res;

    /**
     * 解法二
     */
    public TreeNode increasingBST(TreeNode root) {
        Dfs(root);
        return res.right;
    }

    private void Dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        Dfs(root.left);
        //新建节点并连接到当前节点的右节点,当前节点是0位置，currNode.right才是变化后的二叉树的根节点
        currNode.right = new TreeNode(root.val);
        //当前节点指向下一个结点
        currNode = currNode.right;
        Dfs(root.right);
    }

    /**
     * 解法二
     */
/*    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Dfs(root,list);
        //新建一个节点
        TreeNode dum=new TreeNode(0);
        //指定当前节点
        TreeNode currNode=dum;

        for (Integer value : list) {
            //新建节点并连接到当前节点的右节点,当前节点是0位置，currNode.right才是变化后的二叉树的根节点
            currNode.right=new TreeNode(value);
            //当前节点指向下一个结点
            currNode=currNode.right;
        }
        return dum.right;
    }

    private void Dfs(TreeNode root, List<Integer> list) {
        if (root==null){
            return;
        }
        Dfs(root.left,list );
        list.add(root.val);
        Dfs(root.right, list);;
    }*/
}
