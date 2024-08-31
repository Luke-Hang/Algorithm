package algorithm.algorithm.binaryTree.leetCode;

import java.util.List;

/**
 * @author xiehang
 * @date 2023/2/2 16:12
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
