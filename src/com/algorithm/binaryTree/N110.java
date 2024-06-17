package com.algorithm.binaryTree;

/**
 * @author xiehang
 * @create 2022-05-26 10:18
 * 平衡二叉树
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * 一棵高度平衡二叉树定义为：一个二叉树每个节点的左右两个子树的高度差的绝对值不超过 1
 *  https://leetcode.cn/problems/balanced-binary-tree/
 *
 */

public class N110 {
    public static void main(String[] args) {
        Integer[] arr={3,9,20,null,null,15,7};
//        Integer[] arr = {1,2,2,3,3,null,null,4,4};
        TreeNode root = TreeNodeUtils.arrayToTreeNode(arr);
        System.out.println(isBalanced(root));
    }

    /**
     * 判断该树是否为平衡树
     */
    public static boolean isBalanced(TreeNode root) {
        //解法一
        //1.先判断当前节点的左右子树是否平衡
        //high2(root.left)拿到当前节点左子树的最大高度，
        //high2(root.right)获取当前节点右子树的最大高度
        if (root==null){
            return true;
        }else {
            //左右子树高度差小于1，说明是平衡二叉树
            boolean flag1 = Math.abs(high2(root.left) - high2(root.right)) <= 1;
            //2.再递归判断当前节点左子树和右子树是否平衡
            boolean flag2 = isBalanced(root.left) && isBalanced(root.right);
            return flag1 && flag2;
        }
    }

    /**
     * 解法二：自上而下判断--
     * 1.先判断当前节点的左右子树是否平衡
     * 2.在递归判断当前节点左子树和右子树是否平衡
     *
     * 获取以当前节点为根节点的树的高度
     */
    private static int high2(TreeNode root) {
        if (root == null) {
            return 0;
        }else {
            int left = high2(root.left);
            int right = high2(root.right);
            //该树的最大高度就是左子树高度与右子树高度中的最大值
            return Math.max(left, right) + 1;
        }
    }

    //解法二
    public static boolean isBalanced2(TreeNode root) {
        return high1(root)>=0;
    }
    /**
     * 解法二：自底向上的递归
     * 自底向上递归的做法类似于后序遍历，对于当前遍历到的节点，先递归地判断其左右子树是否平衡，再判断以当前节点为根的子树是否平衡。
     *
     * 如果一棵子树是平衡的，则返回其高度（高度一定是非负整数），否则返回−1。
     * 如果存在一棵子树不平衡，则整个二叉树一定不平衡。
     */
    private static int high1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        //当前节点递到他的左边最后一个节点
        int left = high1(root.left);
        //当前节点递到他的右边最后一个节点
        int right = high1(root.right);
        //判断该节点的左右最后一个节点是否平衡
        //left变为-1，说明左子树不平衡，
        //right变为-1，说明又子树不平衡
        //Math.abs(left - right)>1成立，说明左右子树有高度差，返回-1
        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1;
        }
        //判断完后，又归出去最后一个节点的根节点，判断该节点左右子树是否平衡
        //也就是先递归入栈到当前节点的左边和右边最后一个节点判断其是否平衡，再出栈，即从倒数第二个节点开始出栈判断每个节点是否平衡
        //如果任意节点的子树不平衡，则整个二叉树一定不平衡
        int max = Math.max(left, right);
        return max + 1;
    }
}
