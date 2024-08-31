package algorithm.algorithm.binaryTree.leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import algorithm.algorithm.binaryTree.TreeNode;
import algorithm.algorithm.binaryTree.TreeNodeUtils;

/**
 * @author xiehang
 * @create 2022-05-30 12:04
 * 从上到下打印二叉树 II
 * https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/
 */
public class Offer32 {

    public static void main(String[] args) {
        Integer[] arr={3,9,20,null,null,15,7};
        TreeNode treeNode = TreeNodeUtils.arrayToTreeNode(arr);
        List<List<Integer>> levelOrder = levelOrder(treeNode);
        levelOrder.forEach(val-> System.out.print(val));
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        //新建最外层集合
        List<List<Integer>> list=new ArrayList<>();
        return getLevelOrder(root, list);
    }

    private static List<List<Integer>> getLevelOrder(TreeNode root, List<List<Integer>> list) {
        if (root == null) {
            return list;
        }

        //思路：将当前层级所有元素加入队列中，循环队列，利用队列先进先出的特性，对每层新建一个集合并把当前层级元素加入此集合中，
        // 这样每层元素都在同一个集合中，再把这些集合加入大集合中

        //操作当前节点
        //新建队列
        Queue<TreeNode> que = new LinkedList<>();
        //先将根节点放进队列中
        que.offer(root);

        //  2、poll()和remove()区别：
        // remove() 和 poll() 方法都是从队列中删除第一个元素。如果队列元素为空，调用remove() 的行为与 Collection 接口的版本相似会抛出异常，
        // 但是新的 poll() 方法在用空集合调用时只是返回 null。因此新的方法更适合容易出现异常条件的情况。

        while (!que.isEmpty()) {
            List<Integer> leveList = new ArrayList<>();
            //获取当前层级元素个数
            int currentLevelSize = que.size();
            //因为根节点已经放到队列里了，所以此处层级从1开始，代表第二层级
            for (int i = 0; i < currentLevelSize; i++) {
                //poll() 移除并返问队列头部的元素，如果队列为空，则返回null
                //删除队列头部元素，并返回该元素
                TreeNode node = que.poll();
                leveList.add(node.val);

                if (node.left != null) {
                    que.offer(node.left);
                }
                if (node.right != null) {
                    que.offer(node.right);
                }
            }
            list.add(leveList);
        }
        return list;
    }
}
