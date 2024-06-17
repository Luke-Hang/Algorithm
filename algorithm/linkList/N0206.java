package algorithm.algorithm.linkList;

/**
 * @author xiehang
 * @create 2022-04-15 21:40
 * 面试题 02.06. 回文链表
 * https://leetcode-cn.com/problems/palindrome-linked-list-lcci/
 */
public class N0206 {

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            //fast走2步，slow走一步，当fast走到末尾结点时，slow刚好走到中间结点
            fast = fast.next.next;
            slow = slow.next;
        }
        //反转后半部分链表
        ListNode reverseList = reverseList(slow);
        while (reverseList != null) {
            //遍历链表，如果反转后值不相等，说明该链表不是回纹链表
            if (head.val != reverseList.val) {
                return false;
            }
            head = head.next;
            reverseList = reverseList.next;
        }
        return true;
    }

    /**
     * 假设只有2个节点，递归反转链表
     */
    public static ListNode reverseList(ListNode slow) {
        if (slow == null || slow.next == null) {
            return slow;
        }
        ListNode reverseList = reverseList(slow.next);
        slow.next.next = slow;
        slow.next = null;
        return reverseList;
    }
}
