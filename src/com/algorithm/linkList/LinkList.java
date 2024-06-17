package com.algorithm.linkList;


import java.util.Iterator;

/**
 * @author xiehang
 * @create 2022-03-20 22:27
 */
public class LinkList<T> implements Iterator<T> {

    //记录头结点
    private Node head;
    //记录链表长度
    int N;


    private class Node{
        //存储数据
        T item;
        //下一个结点
        Node next;

        //记录结点类
        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "item=" + item +

                    '}';
        }
    }


    public LinkList() {
        //初始化头结点
        this.head = new Node(null, null);
        //初始化元素个数
        this.N = 0;
    }

    //清空链表
    public void  clear(){
        head.next=null;
        this.N=0;
    }

    //获取链表的长度
    public int length(){
        return N;
    }

    //判断链表是否为空
    public boolean isEmpty(){
        return N==0;
    }

    //获取指定位置i出的元素
    public T get(int i){
        //通过循环,从头结点开始往后找，依次找i次，就可以找到对应的元素
        Node node = head.next;
        for (int j = 0; j < i; j++) {
            node = node.next;
        }
        return node.item;
    }

    //向链表中添加元素t
    public void insert(T t) {
        //找到当前链表的最后一个结点
        Node n=head;
        while (n.next!=null){//最后一个元素的指针是null
            n=n.next;
        }
        //创建新结点，保存元素t
        Node newNode = new Node(t, null);
        //让当前最后一个结点指向新结点
        n.next=newNode;
        //元素的个数+1
        N++;
    }
    //向指定位置i出，添加元素t
    public void insert(int i, T t) {
        //从头结点向后找起
        Node pre=head;
        //找到i位置前一个结点
        for (int j = 0; j <=i-1; j++) {
            pre=pre.next;
        }

        //找到i位置的结点
        Node curr = pre.next;
        //创建新结点，并且新结点需要指向原来i位置的结点,新节点的下一位就是原来的i结点new Node(t,curr)这里传curr
        Node newNode = new Node(t,curr);
        //原来i位置的前一个节点指向新结点即可
        pre.next=newNode;
        //元素的个数+1
        N++;
    }

    //删除指定位置i处的元素，并返回被删除的元素
    public T remove(int i) {

        Node pre = head;
        //找到i位置的前一个节点
        for (int j = 0; j <=i-1; j++) {
            pre=pre.next;
        }
        //要找到i位置的结点
        Node curr = pre.next;
        //找到i位置的下一个结点
        Node nextNode = curr.next;
        //前一个结点指向下一个结点
        pre.next=nextNode;
        //元素个数-1
        N--;
        return curr.item;
    }

    /**
     * 反转整个链表
     * @return
     */
    public void reverse(){
        //链表为空
        if (N==0){
            return;
        }
        reverse(head.next);
    }

    private Node reverse(Node curr) {
        //当前结点就是最后一个结点
        if (curr.next==null){
            //反转后，头结点应该指向原链表中的最后一个元素
            head.next=curr;
            return curr;
        }

        //递归反转当前结点的下一个节点,就是反转后当前结点的前一个结点
        Node pre = reverse(curr.next);
        //反转后pre.next就是当前结点
        pre.next=curr;
        //当前结点的下一个结点设为null
        curr.next=null;
        return curr;
    }

    //遍历链表
    public void list(){
        if (head.next==null){
            System.out.println("该链表为空");
        }

        Node nextNode = head.next;
        while (true){
            if (nextNode==null){//链表只有一个元素，退出循环
                break;
            }
            //输出结点信息
            System.out.println(nextNode);
            //指针域向后移
            nextNode=nextNode.next;
        }
    }


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }
}
