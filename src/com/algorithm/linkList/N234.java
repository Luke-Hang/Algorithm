package com.algorithm.linkList;

/**
 * @author xiehang
 * @create 2022-04-08 8:57
 * 回文链表
 * https://leetcode-cn.com/problems/palindrome-linked-list/
 */
public class N234 {
    public static void main(String[] args) {
//        int[] nums={1,2,2,1};
//        int[] nums={1,2};
        int[] nums = {1};
        ListNode head = new ListNode(nums);
        System.out.println(isPalindrome(head));
    }

    private static boolean isPalindrome(ListNode head) {
        //链表为空或者只有一个元素，就是回文链表
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;
        //快指针走2步，慢指针走一步，当快指针到达终点时，慢指针恰好走到链表的中点
        //{1,2} 不是回文链表
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //反转后半部分链表
        ListNode reverseNode = reverse(slow.next);
        //1-2-3-3-2-1，后半部分链表为3-2-1反转后为1-2-3，前半部分也为1-2-3
        while (reverseNode != null) {
            //值不相等，说明不是回文链表，返回false，
            if (reverseNode.val != head.val) {
                return false;
            }
            reverseNode = reverseNode.next;
            head = head.next;
        }
        //slow走完，值一直相等，说明是回文链表，返回true
        return true;
    }

    /**
     * 假设有两个节点，递归反转链表
     */
    private static ListNode reverse(ListNode head) {
        //当链表为空或者只有一个结点时，无需翻转，返回链表即可
        if (head == null || head.next == null) {
            return head;
        }
        //递归反转链表
        ListNode reverseList = reverse(head.next);
        head.next.next = head;
        //此时原来的head就是反转后链表的最后一个元素，将其下一个元素置为null，即head.next=null
        head.next = null;
        return reverseList;
    }
}
