package algorithm.algorithm.linkList;

/**
 * @author xiehang
 * @create 2022-04-14 21:15
 * 剑指 Offer II 027. 回文链表
 * https://leetcode-cn.com/problems/aMhZSa/
 */
public class OfferII027 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 2, 1};
        ListNode head = new ListNode(nums);
        System.out.println(isPalindrome(head));
    }


    public static boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            //快指针前进2步，慢指针前进一步，当快指针达到链表尾部的时候，慢指针刚好走到链表中点
            fast = fast.next.next;
            slow = slow.next;
        }

        //此时慢指针在链表中点，反转后面的链表
        ListNode reverseList = reverse(slow);

        while (reverseList != null) {
            if (head.val != reverseList.val) {
                return false;
            }
            head = head.next;
            reverseList = reverseList.next;
        }
        return true;
    }

    /**
     * 反转链表
     */
    public static ListNode reverse(ListNode slow) {
        if (slow == null || slow.next == null) {
            return slow;
        }
        ListNode reverse = reverse(slow.next);
        slow.next.next = slow;
        slow.next = null;
        return reverse;
    }
}
