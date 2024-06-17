package algorithm.algorithm.linkList;

/**
 * @author xiehang
 * @create 2022-04-14 22:53
 * 面试题 02.02. 返回倒数第 k 个节点
 * https://leetcode-cn.com/problems/kth-node-from-end-of-list-lcci/
 */
public class N0202 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;
        ListNode head = new ListNode(nums);
        System.out.println(kthToLast(head, k));
    }

    /**
     * 解法一
     */
//    public static int kthToLast(ListNode head, int k) {
//        ListNode p=head;
//        int count=0;
//        while (p!=null){
//            p=p.next;
//            count++;
//        }
//        for (int i = 0; i < count-k; i++) {
//            head=head.next;
//        }
//        head.next=null;
//        return head.val;
//    }

    /**
     * 快慢指针法
     */
    public static int kthToLast(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        //fast先走k步，假设起始节点是1，那么fast向前走k+1,fast与slow相差k位
        while (k != 0) {
            fast = fast.next;
            k--;
        }

        //fast与slow相差k位，当fast为null时，slow刚好走到结点k处
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.val;
    }
}
