package algorithm.algorithm.linkList;

/**
 * @author xiehang
 * @create 2022-04-14 8:51
 * 剑指 Offer 18. 删除链表的节点
 * https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/
 */
public class Offer18 {
    public static void main(String[] args) {
//        int[] nums = {4, 5, 1, 9};
        int[] nums = {1, 5, 4, 9};
        int val = 1;
        ListNode head = new ListNode(nums);
        System.out.println(deleteNode(head, val));
    }

    /**
     * 解法一
     */
    public static ListNode deleteNode(ListNode head, int val) {
        //return head.next代表链表后边的元素，相当于删除了值相等的头节点
        if (head.val == val) {
            return head.next;
        }
        //若第一个元素不是目标元素，这里从第二个元素开始
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null) {
            if (fast.val != val) {
                fast = fast.next;
                slow = slow.next;
            } else {
                //找到该元素，即fast.val == val，将指慢针指向下一个元素，即fast.next
                slow.next = fast.next;
                break;
            }
        }
        return head;
    }
}
