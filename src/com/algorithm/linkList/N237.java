package com.algorithm.linkList;

/**
 * @author xiehang
 * @create 2022-04-12 9:14
 * 删除链表中的节点
 * https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 *
 * 删除链表中的节点的常见的方法是定位到待删除节点的上一个节点，修改上一个节点的next指针，使其指向待删除节点的下一个节点，
 * 即可完成删除操作。
 * 给定链表 4→5→1→9要被删除的节点是 5
 * 1.将第2个节点的值修改为第3个节点的值，即将节点5的值修改为1，此时链表如下4→1→1→9
 * 2.删除第3个节点,此时链表如下4→1→9
 * 达到删除节点5的效果。
 */


/**
 * 既然不能干掉自己，那就变成别人然后把他干掉就好了
 */
public class N237 {
    public void deleteNode(ListNode node) {
        //将第2个节点的值修改为第3个节点的值
        node.val=node.next.val;
        //删除第3个节点
        node.next=node.next.next;
    }
}
