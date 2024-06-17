package algorithm.algorithm.binaryTree;

/**
 * @author xiehang
 * @create 2022-05-29 12:15
 * 左叶子之和
 * https://leetcode.cn/problems/sum-of-left-leaves/
 */
public class N404 {
    public static void main(String[] args) {
        Integer[] arr={3,9,20,null,null,15,7};
        TreeNode treeNode = TreeNodeUtils.arrayToTreeNode(arr);
        System.out.println(sumOfLeftLeaves(treeNode));

    }

    public static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        //只考虑当前节点做什么---确定终止条件
        //判断节点是否为左叶子节点，如果是则将它的和累计起来
        //左叶子节点的特征：
        //根节点左叶子结点不为空，左叶子节点的左叶子节点为空，根节点的左叶子节点右叶子结点为空
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }
        //每次调用应该返回什么----确定递归函数返回值以及参数
        return sum + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}
