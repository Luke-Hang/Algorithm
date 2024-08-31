package algorithm.algorithm.binaryTree.leetCode;

import java.util.ArrayList;
import java.util.List;
import algorithm.algorithm.binaryTree.TreeNode;
/**
 * @author xiehang
 * @date 2023/2/2 15:49
 */
public class P590 {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        postorder(root, list);
        return list;
    }

    private void postorder(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }
        //每次递归时，先递归访问每个孩子节点，然后再访问根节点即可
        for (Node rt : root.children) {
            postorder(rt, list);
        }
        list.add(root.val);
    }
}
