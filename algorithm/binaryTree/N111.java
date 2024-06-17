package algorithm.algorithm.binaryTree;

/**
 * @author xiehang
 * @create 2022-05-26 22:32
 * 二叉树的最小深度
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * https://leetcode.cn/problems/minimum-depth-of-binary-tree/
 */
public class N111 {
    public static void main(String[] args) {
//        Integer[] arr={3,9,20,null,null,15,7};
        Integer[] arr = {2, null, 3, null, 4, null, 5, null, 6};
        TreeNode root = TreeNodeUtils.arrayToTreeNode(arr);
        System.out.println(minDepth(root));
    }

    /**
     * 二叉树的最小深度
     * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
     *
     * @param root
     * @return
     */
    private static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
//        写出结束条件
//        不要把树复杂化，就当做树是三个节点，根节点，左子节点，右子节点,其他的交给递归
//        只考虑当前做什么，不用考虑下次应该做什么
//        每次调用应该返回什么

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        //就当做树是三个节点，根节点，左子节点，右子节点
        //该根节点有三种情况：1.左子树为空 2右子树为空 3左右子树都不为空
        //1.左子树为空,root.left==null调用minDepth返回left=0;
        //2.右子树为空,root.right==null,调用minDepth返回right=0
        if (left == 0 || right == 0) {
            return 1 + left + right;
        } else {
         //3.左右子树都不为空
            return Math.min(left, right)+1;
        }
    }
}
