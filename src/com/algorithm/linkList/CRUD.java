package com.algorithm.linkList;

/**
 * @author xiehang
 * @create 2022-12-13 11:11
 */
public class CRUD {
    //头结点
    private Node head;
    //尾结点
    private Node last;
    //链表实际长度
    private int size;

    /**
     *  链表插入元素
     * @param data  插入元素
     * @param index 插入位置
     */
    public void insert(int data, int index){
        //新建一个要插入的节点
        Node insertNode=new Node(data);
        //空链表
        if (size==0){
            //当链表为空时，新加入一个节点，该链表只有一个节点
            head=insertNode;
            last=insertNode;
        }else if (index==0){
            //插入头部
//            头部插入，可以分成两个步骤。
//            第1步，把新节点的next指针指向原先的头节点。
//            第2步，把新节点变为链表的头节点
            insertNode.next=head;
            head=insertNode;
        }else if (size==index){
            //插入尾部
            //插入尾部， 可以分成两个步骤。
//            第1步，把原来尾结点的next指针指向新节点的
//            第2步，把新节点变为尾结点
            last.next=insertNode;
            last=insertNode;
        }else{
            //插入中间
            //中间插入，同样分为两个步骤。
//            第1步，新节点的next指针， 指向插入位置的节点。也就是将插入节点后移一位
//            第2步，插入位置前置节点的next指针， 指向新节点

            //获取插入节点的前一个元素
            Node prev=get(index-1);

            //新节点的next指针， 指向插入位置的节点，
            //插入位置的节点就是前一个元素指针指向的元素即为prev.next
            insertNode.next=prev.next;
            //插入位置前置节点的next指针,指向新节点
            prev.next=insertNode;
        }
        //链表长度+1
        size++;
    }

    /**
     *
     * @param index
     * @return
     */
    public Node remove(int index){
        Node removeNode=null;
        //删除头结点
        if (index==0){
            removeNode=head;
            head=head.next;
        }else if (index==size-1){
            //删除尾结点
            Node preNode = get(index);
            removeNode=preNode.next;
            preNode.next=null;
            last=preNode;
        }else {
            Node preNode = get(index-1);
            //nextNode删除元素后的下一个元素
            Node nextNode= preNode.next.next;
            removeNode=preNode.next;
            //将原来的前一个元素指向新的后一个元素
            preNode.next=nextNode;
        }
        size--;
        return removeNode;
    }


    /**
     * 输出链表
     * @param index
     */
    public void output(int index){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    /**
     * 链表查找元素
     * @param index 查找的位置
     * @return
     */
    private Node get(int index) {
        Node temp=head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        return temp;
    }
}
