package com.algorithm.binaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiehang
 * @date 2023/2/2 16:23
 */
public class P94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        inorderTraversal(root,list);
        return list;
    }

    private void inorderTraversal(TreeNode root, List<Integer> list) {
        if (root==null){
            return;
        }
        inorderTraversal(root.left,list);
        list.add(root.val);
        inorderTraversal(root.right,list);
    }

}
