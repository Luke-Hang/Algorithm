package algorithm.algorithm.linkList;

/**
 * @author xiehang
 * @create 2022-04-15 21:57
 * https://leetcode.cn/problems/intersection-of-two-linked-lists-lcci/
 * 链表相交
 */
public class N0207 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;
        //当p1=p2的时候，退出循环，相当于找到了相交节点
        while (p1 != p2) {
            if (p1 == null) {
                //p1指向headB
                p1 = headB;
            } else {
                p1 = p1.next;
            }

            if (p2 == null) {
                //p1指向headB
                p2 = headA;
            } else {
                p2 = p2.next;
            }
        }
        //当p1=p2的时候，退出循环，相当于找到了相交节点，此时返回p1和p2都可以
        return p1;
    }
}
