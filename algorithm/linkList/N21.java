package algorithm.algorithm.linkList;

/**
 * @author xiehang
 * @create 2022-03-31 21:22
 * 合并两个有序链表
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 */
public class N21 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 4};
        int[] nums2 = {1, 3, 4};

        ListNode list1 = new ListNode(nums1);
        ListNode list2 = new ListNode(nums2);
        ListNode listNode = mergeTwoLists(list1, list2);
        System.out.println(listNode);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //创建链表虚拟头结点
        ListNode dummy = new ListNode(0);
        //指针p指向链表dummy的头节点
        ListNode p = dummy;

        //双指针
        ListNode p1 = list1, p2 = list2;

        while (p1 != null && p2 != null) {
            // 比较p1和p2两个节点的数据大小
            // 将p指针指向值较小的节点
            if (p1.val > p2.val) {
                //将虚拟链表的指针指向指针p2
                p.next = p2;
                //p2指针右移
                p2 = p2.next;
            } else {
                //虚拟链表指针指向p1
                p.next = p1;
                //p2指针右移
                p1 = p1.next;
            }
            //虚拟指针右移
            p = p.next;
        }

        //任一链表为空，直接连接另一条链表
        if (p1 == null) {
            p.next = p2;
        }
        if (p2 == null) {
            p.next = p1;
        }
        //真实的链表从虚拟的头结点下一个元素开始
        return dummy.next;
    }
}
