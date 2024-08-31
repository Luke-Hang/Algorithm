package algorithm.algorithm.binaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiehang
 * @date 2024/8/28 8:36
 */
public class Template {

    private static List list = new ArrayList<>();
    public static void main(String[] args) {
        TreeNode root=TreeNodeUtils.arrayToTreeNode(new Integer[]{1,2,3,4,5,6,7});
//        preOrder1(root);
    }

    /* 前序遍历 */
    void preOrder(TreeNode root){
        if (root == null) {
            return;
        }
        // 访问优先级：根节点 -> 左子树 -> 右子树
        list.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    /* 中序遍历 */
    void inOrder(TreeNode root){
        if (root == null) {
            return;
        }
        // 访问优先级：左子树 -> 根节点 -> 右子树
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }

    /* 后序遍历 */
    void postOrder(TreeNode root){
        if (root == null) {
            return;
        }
        // 访问优先级：左子树 -> 右子树 -> 根节点
        postOrder(root.left);
        postOrder(root.right);
        list.add(root.val);
    }
}
