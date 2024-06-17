package com.algorithm.linkList;

/**
 * @author xiehang
 * @create 2022-04-14 15:57
 * 剑指 Offer 24. 反转链表
 * https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/
 */
public class Offer24 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        ListNode head = new ListNode(nums);
        System.out.println(head);
        System.out.println(reverseList(head));

    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode reverseList = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reverseList;
    }
}
