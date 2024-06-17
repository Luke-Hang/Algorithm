package algorithm.algorithm.binaryTree;

/**
 * @author xiehang
 * @create 2022-05-30 8:52
 * 对称的二叉树
 * 用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 * https://leetcode.cn/problems/dui-cheng-de-er-cha-shu-lcof/submissions/
 */
public class Offer28 {
    public static void main(String[] args) {
//        Integer[] arr = {1, 2, 2, 3, 4, 4, 3};
        Integer[] arr = {1,2,2,null,3,null,3};
        TreeNode treeNode = TreeNodeUtils.arrayToTreeNode(arr);
        System.out.println(isSymmetric(treeNode));
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return getSymmetric(root.left, root.right);
    }

    private static boolean getSymmetric(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        return getSymmetric(p.left, q.right) && getSymmetric(p.right, q.left);
    }
}
