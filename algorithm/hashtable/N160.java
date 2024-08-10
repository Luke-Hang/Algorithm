package algorithm.algorithm.hashtable;

import algorithm.algorithm.linkList.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xiehang
 * @create 2022-04-28 9:28
 * https://leetcode.cn/problems/intersection-of-two-linked-lists/
 */
public class N160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> hs = new HashSet<>();
        //将链表A放进HashSet中
        while (headA != null) {
            hs.add(headA);
            headA = headA.next;
        }
        //遍历链表B，如果发现有相同的节点，说明找到了相交的节点，返回该节点即可
        while (headB != null) {
            if (hs.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        //如果两个链表不存在相交节点，返回null
        return null;
    }
}
