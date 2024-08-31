package algorithm.algorithm.binaryTree.leetCode;
import algorithm.algorithm.binaryTree.TreeNode;
/**
 * @author xiehang
 * @create 2022-05-28 9:57
 *  翻转二叉树
 *  给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
 *  https://leetcode.cn/problems/invert-binary-tree/
 */
public class N226 {
    public static void main(String[] args) {
        Integer[] arr={4,2,7,1,3,6,9};
    }

    /**
     * 刚刚进入一个二叉树节点的时候就可执行,采用前序遍历
     */
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        //前序遍历
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
