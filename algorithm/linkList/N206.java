package algorithm.algorithm.linkList;

/**
 * @author xiehang
 * @create 2022-04-05 22:16
 * 反转链表
 * https://leetcode-cn.com/problems/reverse-linked-list/
 */
public class N206 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6};
        ListNode head = new ListNode(nums);
        System.out.println(head);
        ListNode listNode = reverseList(head);
        System.out.println(listNode);
    }

    private static ListNode reverseList(ListNode head) {
        //当链表为空或者只有一个结点时，无需翻转，返回链表即可
        if (head == null || head.next == null) {
            return head;
        }

        //递归反转链表
        ListNode P = reverseList(head.next);
        // 翻转头节点与第二个节点的指向
        // head.next.next就是第二个节点的指向，让他指向head节点，就完成了一次反转
        head.next.next = head;
        //此时原来的head就是反转后链表的最后一个元素，将其下一个元素置为null，即head.next=null
        head.next = null;
        return P;
    }
}
