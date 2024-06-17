package com.algorithm.linkList;

/**
 * @author xiehang
 * @create 2022-04-14 14:15
 * 剑指 Offer 22. 链表中倒数第k个节点
 *  https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 */
public class Offer22 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        ListNode head=new ListNode(nums);
        int k=2;
        System.out.println(getKthFromEnd(head,k));
    }

    /**
     * 方法一
     * 1.先遍历统计链表长度，记为 nn ；
     * 2.设置一个指针走 (n-k)(n−k) 步，即可找到链表倒数第 kk 个节点。
     */
    public static ListNode getKthFromEnd(ListNode head, int k) {
        if (head==null){
            return head;
        }
        ListNode p=head;
        int count=0;
        while (p!=null){
            p=p.next;
            count++;
        }
        for (int i = 0; i <count-k; i++) {
            head=head.next;
        }
        return head;
    }

    /**
     * fast先向前走K步，此时fast指针刚好指向链表的k+1处,与slow相差k不
     * 此时让slow 与fast同时走，当fast指针指向链表的尾部空节点时，slow刚好走到k处
     * 即尾部空节点时k+1时，slow刚好走到k处
     */
    public static ListNode getKthFromEnd2(ListNode head, int k) {
        ListNode slow=head;
        ListNode fast=head;
        //fast先向前走K步，此时fast指针刚好指向链表的k+1处,与slow相差k不
        while (fast != null && k > 0) {
            fast = fast.next;
            k--;
        }
        //此时让slow 与fast同时走，当fast指针指向链表的尾部空节点时，slow刚好走到k处
        //即尾部空节点时k+1时，slow刚好走到k处
        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        //返回slow就是所要的k节点
        return slow;
    }
}
