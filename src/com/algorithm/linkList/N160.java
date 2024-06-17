package com.algorithm.linkList;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xiehang
 * @create 2022-04-03 11:02
 * 相交链表
 * https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 */
public class N160 {
    public static void main(String[] args) {
    }

    /**
     * 双指针法
     */
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //p1指针指向A链表头结点，p2指针指向B链表头结点
        ListNode p1 = headA;
        ListNode p2 = headB;

        while (p1 != p2) {
            //p1走一步，如果遇到A链表末尾，那么转到B链表
            if (p1 == null) {
                p1 = headB;
            } else {
                p1 = p1.next;
            }

            //p2走一步，如果遇到B链表末尾，那么转到A链表
            if (p2 == null) {
                p2 = headA;
            } else {
                p2 = p2.next;
            }
        }
        //走到这里，说明p1=p2,此处返回p1或者p2都可以
        return p2;
    }

    /**
     * 解法二，哈希表
     */
    public static ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        while (headA != null) {
            set.add(headA);
            //headA指针右移
            headA = headA.next;
        }

        while (headB != null) {
            if (set.contains(headB)) {
                return headB;
            }
            //headB指针右移
            headB=headB.next;
        }
        return null;
    }
}
