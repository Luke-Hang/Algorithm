package algorithm.algorithm.binaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiehang
 * @create 2022-05-19 9:21
 * 给定一个二叉树的根节点 root ，返回它的中序遍历 。
 * 思路：中序遍历就是左中右
 * https://leetcode.cn/problems/binary-tree-inorder-traversal/
 */
public class N94 {
    public static void main(String[] args) {
        Integer[] arr={1,null,2,3};
        TreeNode root = TreeNodeUtils.arrayToTreeNode(arr);
        List<Integer> list = inorderTraversal(root);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        inorderTraversal(root,list);
        return list;
    }

    /**
     * 写出结束条件
     * 不要把树复杂化，就当做树是三个节点，根节点，左子节点，右子节点
     * 只考虑当前做什么，不用考虑下次应该做什么
     * 每次调用应该返回什么
     *
     * @param root
     * @param list
     */
    private static void inorderTraversal(TreeNode root, List<Integer> list) {
        if (root==null){
            return;
        }
//        就当做树是三个节点，根节点，左子节点，右子节点
        inorderTraversal(root.left,list);//左
        list.add(root.val);//当前节点
        inorderTraversal(root.right,list);
    }
}
