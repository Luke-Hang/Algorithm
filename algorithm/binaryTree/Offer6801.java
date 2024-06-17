package algorithm.algorithm.binaryTree;

/**
 * @author xiehang
 * @create 2022-07-07 0:01
 * 剑指 Offer 68 - I. 二叉搜索树的最近公共祖先
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 * https://leetcode.cn/problems/er-cha-sou-suo-shu-de-zui-jin-gong-gong-zu-xian-lcof/
 * 二叉搜索树，中序遍历是有序的,
 * 那么这个最近公共祖先的值一定位于这两个节点值的中间
 */
public class Offer6801 {
    public static void main(String[] args) {
        Integer[] arr={6,2,8,0,4,7,9,null,null,3,5};
        TreeNodeUtils.arrayToTreeNode(arr);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return root;
        }
        //当前节点在p,q节点左边,
        if (root.val < p.val && root.val < q.val) {
            //在右子树中继续寻找最近公共祖先
            //加return就是一直向右找，不可能再向左边找了，最近公共祖先绝对在p,q节点右边
            return lowestCommonAncestor(root.right, p, q);
        }
        //当前节点在p,q节点右边
        if (root.val > p.val && root.val > q.val) {
            //在左子树中继续寻找最近公共祖先
            //加return就是一直向左找，不可能再向右边找了，最近公共祖先绝对在p,q节点左边
            return lowestCommonAncestor(root.left, p, q);
        }
        //当前节点在p,q节点中间，那么此结点就是p,q节点的最近公共祖先
        return root;
    }
}
