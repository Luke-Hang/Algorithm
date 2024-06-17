package algorithm.algorithm.binaryTree;

import java.util.HashSet;
import java.util.Set;
/**
 * @author xiehang
 * @create 2022-07-07 11:03
 * 剑指 Offer II 056. 二叉搜索树中两个节点之和
 * https://leetcode.cn/problems/opLdQZ/
 * 给定一个二叉搜索树的根节点root和一个整数k,请判断该二叉搜索树中是否存在两个节点它们的值之和等于 k 。假设二叉搜索树中节点的值均唯一。
 */
public class OfferII056 {

    public static Set<Integer> set = new HashSet<>();

    public static void main(String[] args) {
        Integer[] arr = {8, 6, 10, 5, 7, 9, 11};
        int k = 12;
        TreeNode root = TreeNodeUtils.arrayToTreeNode(arr);
        boolean target = findTarget(root, k);
        System.out.println(target);
    }

    public static boolean findTarget(TreeNode root, int k) {

        if (root == null) {
            return false;
        }
        //k-root.val=另一个节点的值
        //set.contains(k-root.val)set中有k-root.val(K-当前节点的值)，说明已经有另一个节点的值+当前root.val=k
        //如果找到返回true,结束程序
        if (set.contains(k - root.val)) {
            return true;
        }
        //如果没找到则将当前节点的值存入set中
        set.add(root.val);

        //在当前节点左子树或右子树继续寻找另一个节点，找到一个即可
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}
