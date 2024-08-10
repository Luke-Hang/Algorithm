package algorithm.algorithm.linkList;

/**
 * @author xiehang
 * @create 2022-04-12 12:16
 * 剑指 Offer 06. 从尾到头打印链表
 * https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 */
public class Offer06 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2};
        ListNode head = new ListNode(nums);
        System.out.println(reversePrint(head));
    }

    public static int[] reversePrint(ListNode head) {
        //反转链表
        ListNode reverseHead = reverse(head);
        //计数指针
        ListNode countList = reverseHead;
        int count = 0;
        while (countList != null) {
            countList = countList.next;
            count++;
        }
        //填值
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = reverseHead.val;
            reverseHead = reverseHead.next;
        }
        return arr;
    }

    private static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode listNode = reverse(head.next);
        head.next.next = head;
        //此时原来的head就是反转后链表的最后一个元素，将其下一个元素置为null，即head.next=null
        head.next = null;
        return listNode;
    }
}