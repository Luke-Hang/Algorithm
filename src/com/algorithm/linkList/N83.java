package com.algorithm.linkList;

/**
 * @author xiehang
 * @create 2022-03-29 22:39
 * 删除排序链表中的重复元素
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 */
public class N83 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 5, 5};
//        int[] nums = {1, 1, 2};
        ListNode head = new ListNode(nums);
        System.out.println(head);
        ListNode listNode = deleteDuplicates(head);
        System.out.println(listNode);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        //快慢指针指向头节点
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null) {
            if (fast.val != slow.val) {
                // nums[slow] = nums[fast];
                slow.next = fast;
                // slow++;慢指针前进一步
                slow = slow.next;
            }
            // fast++快指针前进一步
            fast = fast.next;
        }
        //断开与后⾯重复元素的连接，让其为该链表中的最后一个元素
        slow.next = null;
        return head;
    }
}
