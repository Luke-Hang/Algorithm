package algorithm.algorithm.binaryTree.leetCode;
import algorithm.algorithm.binaryTree.TreeNode;
import algorithm.algorithm.binaryTree.TreeNodeUtils;

/**
 * @author xiehang
 * @create 2022-07-07 9:01
 * 剑指 Offer 68 - II. 二叉树的最近公共祖先
 * https://leetcode.cn/problems/er-cha-shu-de-zui-jin-gong-gong-zu-xian-lcof/
 */
public class Offer6802 {
    public static void main(String[] args) {
        Integer[] arr = {6, 2, 8, 0, 4, 7, 9, null, null, 3, 5};
        TreeNode root = TreeNodeUtils.arrayToTreeNode(arr);
    }

    /**
     * 三种情况：
     * 1、p q 一个在左子树 一个在右子树 那么当前节点即是最近公共祖先
     * 2、p q 都在左子树
     * 3、p q 都在右子树
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //root 为null或者为p,q中的某个节点，则其最近公共祖先就是他自己
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        //p,q都在左子树
        if (right == null) {
            return left;
        }

        //p,q都在右子树
        if (left == null) {
            return right;
        }

        //p q 一个在左子树 一个在右子树 那么当前节点即是最近公共祖先
        return root;
    }
}
