package com.algorithm.linkList;

/**
 * @author xiehang
 * @create 2022-04-03 10:50
 * 链表的中间结点
 * https://leetcode-cn.com/problems/middle-of-the-linked-list/
 */
public class N876 {
    public static void main(String[] args) {

    }

    public static ListNode middleNode(ListNode head) {
        //初始化快慢指针指向head
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            //慢指针走一步，快指针走两步，那么当快指针走到尾结点时，慢指针刚好走到中间结点
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
