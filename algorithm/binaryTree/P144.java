package algorithm.algorithm.binaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiehang
 * @date 2023/2/2 15:42
 */
public class P144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        preorderTraversal(list,root);
        return list;
    }

    private void preorderTraversal(List<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        preorderTraversal(list, root.left);
        preorderTraversal(list, root.right);
    }
}
