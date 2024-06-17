package algorithm.algorithm.linkList;

/**
 * @author xiehang
 * @create 2022-04-14 21:11
 * 剑指 Offer II 024. 反转链表
 * https://leetcode-cn.com/problems/UHnkqh/
 */
public class OfferII024 {
    public ListNode reverseList(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode reverseList = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reverseList;
    }
}
