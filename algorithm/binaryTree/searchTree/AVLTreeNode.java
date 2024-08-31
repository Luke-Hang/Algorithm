package algorithm.algorithm.binaryTree.searchTree;

/**
 * @author xiehang
 * @date 2024/8/29 11:44
 *
 *
 * AVL 树既是二叉搜索树，也是平衡二叉树，同时满足这两类二叉树的所有性质，因此是一种平衡二叉搜索树
 */
public class AVLTreeNode {
    public int val; // 节点值
    public int height; // 节点高度
    public AVLTreeNode left; // 左子节点
    public AVLTreeNode right; // 右子节点
    public AVLTreeNode(int x) { val = x; }
}
