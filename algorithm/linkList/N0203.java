package algorithm.algorithm.linkList;

/**
 * @author xiehang
 * @create 2022-04-14 23:09
 * https://leetcode.cn/problems/delete-middle-node-lcci/
 * 面试题 02.03. 删除中间节点
 */
public class N0203 {
    public static void main(String[] args) {

    }

    public void deleteNode(ListNode node) {
        //中间节点就是node
        // 把下一个节点的值赋值给自己
        node.val=node.next.val;
        //此时删除下一个结点，相当于删了自己
        node.next=node.next.next;
    }
}
