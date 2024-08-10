package algorithm.algorithm.linkList;

/**
 * @author xiehang
 * @create 2022-04-14 21:39
 * 面试题 02.01. 移除重复节点
 * https://leetcode-cn.com/problems/remove-duplicate-node-lcci/
 */
public class N0201 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 2, 1};
//        [1, 1, 1, 1, 2]
        ListNode head = new ListNode(nums);
        System.out.println(removeDuplicateNodes(head));
    }

    public static ListNode removeDuplicateNodes(ListNode head) {
        ListNode slow = head;
        while (slow != null) {
            ListNode fast = slow;
            while (fast != null && fast.next != null) {
                //当下一个结点的值和当前结点相等时，将当前结点指针指向下一个结点的下一个结点，相当于删除了当前结点的下一个结点
                //也就是删除了和当前结点值相同的节点
                if (fast.next.val == slow.val) {
                    fast.next = fast.next.next;
                } else {//当前节点的值和下一个结点的值不相同，快指针向前走一步
                    fast = fast.next;
                }
            }
            //遍历完一次链表时，慢指针前进一步
            slow = slow.next;
        }
        return head;
    }
}
