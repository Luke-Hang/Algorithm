package algorithm.algorithm.hashtable;

import algorithm.algorithm.linkList.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xiehang
 * @create 2022-04-27 12:26
 * 环形链表
 * 给你一个链表的头节点 head ，判断链表中是否有环。
 * https://leetcode.cn/problems/linked-list-cycle/
 */
public class N141 {
    /**
     * 使用HashSet，我们可以使用哈希表来存储所有已经访问过的节点，每次我们到达一个节点，如果该节点已经存在于哈希表中，
     * 则说明该链表是环形链表，否则就将该节点加入哈希表中
     */
    public boolean hasCycle(ListNode head) {
        Set<ListNode> hs = new HashSet<>();
        //HashSet 的add方法，
        //当HashSet中没有该元素时，元素被add到HashSet，并返回true
        //当HashSet中有该元素时，元素不会被add到HashSet，并且返回false
        while (head != null) {
            //!hs.add(head)元素加不进去了，说明元素已经被加入了人HashSet中，说明有环
            if (!hs.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
