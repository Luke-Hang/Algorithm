package com.algorithm.linkList;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xiehang
 * @create 2022-03-31 23:57
 * 环形链表
 * https://leetcode-cn.com/problems/linked-list-cycle/
 */
public class N141 {
    public static void main(String[] args) {

    }

    /**
     * 解法一，使用哈希表
     */
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            //set.add元素已存在，添加失败返回false，元素不存在，添加成功返回true
            //!set.add(head)，元素加不进去，说明已经有元素添加进去了，
            if (!set.add(head)) {
                return true;
            }
            //指针右移
            head = head.next;
        }
        return false;
    }

    /**
     * 解法2，使用双指针
     */
    public static boolean hasCycle2(ListNode head) {
        //快慢指针初始化指向head
        ListNode slow = head;
        ListNode fast = head;
        //快指针走到末尾是停止
        while (fast != null && fast.next != null) {
            //快指针走两步，慢指针走一步快指针走两步，慢指针走一步
            fast = fast.next.next;
            slow = slow.next;
            //快慢指针相遇，说明含有环
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
