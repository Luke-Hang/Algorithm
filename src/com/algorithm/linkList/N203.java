package com.algorithm.linkList;

/**
 * @author xiehang
 * @create 2022-04-07 9:41
 * 移除链表元素
 * https://leetcode-cn.com/problems/remove-linked-list-elements/
 */
public class N203 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = new ListNode(nums);
        int val = 6;
        System.out.println(removeElements(head, val));
    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }

        //创建虚拟链表
        ListNode dummy = new ListNode(0);
        //指针p指向头节点
        ListNode p = dummy;
        ListNode fast = head;
        while (fast != null) {
            //数据不相等，说明没找到，继续遍历链表查找
            if (fast.val != val) {
                p.next = fast;
                p = p.next;
            }
            fast = fast.next;
        }
        //断开与后⾯重复元素的连接，让其为该链表中的最后一个元素
        p.next = null;
        //真实的链表从虚拟的头结点下一个元素开始
        return dummy.next;
    }
}
