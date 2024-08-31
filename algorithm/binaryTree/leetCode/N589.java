package algorithm.algorithm.binaryTree.leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiehang
 * @date 2023/2/2 16:39
 * N 叉树的前序遍历
 * https://leetcode.cn/problems/n-ary-tree-preorder-traversal/
 */
public class N589 {
    public List<Integer> preorder(Node root) {
        List<Integer> list=new ArrayList<>();
        preorder(root,list);
        return list;
    }

    private void preorder(Node root, List<Integer> list) {
        if (root==null){
            return;
        }
        //遍历顺序为根左右
        list.add(root.val);
        List<Node> childrens = root.children;
        for (Node child : childrens) {
            preorder(child,list);
        }
    }
}
