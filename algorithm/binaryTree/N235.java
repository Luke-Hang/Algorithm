package algorithm.algorithm.binaryTree;

/**
 * @author xiehang
 * @create 2022-05-28 10:28
 * 二叉搜索树的最近公共祖先
 * https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-search-tree/
 *
 * 二叉搜索树是有序的，体现在---左节点值<根节点的值<右节点的值
 * 那么当节点在p和q的节点值之间市，该节点就是p，q最近公共祖先
 */
public class N235 {
    public static void main(String[] args) {
        Integer[] arr={6,2,8,0,4,7,9,null,null,3,5};
        TreeNodeUtils.arrayToTreeNode(arr);
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return root;
        }
        //p,q都在当前节点左边
        if (p.val < root.val && q.val < root.val) {
            //在左子树中继续寻找最近公共祖先
            //加return就是一直向左找，不可能再向右找了，最近公共祖先绝对在p,q节点左边
            return lowestCommonAncestor(root.left, p, q);
        }
        //p,q结点都在当前节点右边
        if (p.val > root.val && q.val > root.val) {
            //在右子树中继续寻找最近公共祖先
            //加return就是一直向右找，不可能再向左找了，最近公共祖先绝对在p,q节点右边
            return lowestCommonAncestor(root.right, p, q);
        }
        //p,q分别位于该节点的左边和右边，该节点就是p,q的最近公共祖先，返回该节点
        return root;
    }
}
