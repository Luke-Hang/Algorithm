package algorithm.algorithm.binaryTree;

import java.util.LinkedList;

/**
 * @author xiehang
 * @create 2022-05-19 9:20
 * 根据自己练题总结的递归技巧，如果嫌我太菜不要喷
 * 写出结束条件
 * 不要把树复杂化，就当做树是三个节点，根节点，左子节点，右子节点
 * 只考虑当前做什么，不用考虑下次应该做什么
 * 每次调用应该返回什么
 */
public class TreeNode {
    public int val;// 节点值
    public TreeNode right;// 左子节点引用
    public TreeNode left;// 右子节点引用
    public TreeNode(int val) {
        this.val = val;
    }
    public TreeNode() {
    }

    public static TreeNode getTreeNode(Integer[] nums) {
        if (nums.length == 0) {
            return null;
        }
        TreeNode head = new TreeNode(nums[0]);
        LinkedList<TreeNode> subTree = new LinkedList<>();
        subTree.push(head);
        for (int i = 1; i < nums.length; i++) {
            if (!subTree.isEmpty()) {
                TreeNode cur = subTree.pop();
                if (nums[i] != null) {
                    cur.left = new TreeNode(nums[i]);
                    subTree.add(cur.left);
                }
                i++;
                if (i >= nums.length) {
                    break;
                }
                if (nums[i] != null) {
                    cur.right = new TreeNode(nums[i]);
                    subTree.add(cur.right);
                }

            } else {
                break;
            }
        }
        return head;
    }
}
