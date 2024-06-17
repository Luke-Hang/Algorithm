package algorithm.algorithm.linkList;

/**
 * @author xiehang
 * @create 2022-04-14 20:22
 * 剑指 Offer 25. 合并两个排序的链表
 * https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/
 */
public class Offer25 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 4};
        int[] nums2 = {1, 3, 4};
        ListNode l1 = new ListNode(nums1);
        ListNode l2 = new ListNode(nums2);
        System.out.println(mergeTwoLists(l1, l2));

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                p.next = l2;
                l2 = l2.next;
            } else {
                p.next = l1;
                l1 = l1.next;
            }
            p = p.next;
        }

        //l1合并完，合并l2剩余元素
        if (l1 == null) {
            p.next = l2;
        }

        //l2合并完，合并l1剩余元素
        if (l2 == null) {
            p.next = l1;
        }

        //合并后 l1 和 l2 最多只有一个还未被合并完,我们直接将链表末尾指向未合并完的链表即可
        p.next = l1 == null ? l2 : l1;

        return dummy.next;
    }
}
