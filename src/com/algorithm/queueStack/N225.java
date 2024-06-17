package com.algorithm.queueStack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author xiehang
 * @create 2022-04-16 11:26
 * 225. 用队列实现栈
 * https://leetcode-cn.com/problems/implement-stack-using-queues/
 *
 *  java Queue中 add/offer，element/peek，remove/poll
 *  1、add()和offer()区别:
 * add()和offer()都是向队列中添加一个元素。一些队列有大小限制，因此如果想在一个满的队列中加入一个新项，调用 add() 方法就会抛出一个
 * unchecked 异常，而调用 offer() 方法会返回 false。因此就可以在程序中进行有效的判断！
 *
 * 2、poll()和remove()区别：
 * remove() 和 poll() 方法都是从队列中删除第一个元素。如果队列元素为空，调用remove() 的行为与 Collection 接口的版本相似会抛出异常，
 * 但是新的 poll() 方法在用空集合调用时只是返回 null。因此新的方法更适合容易出现异常条件的情况。
 *
 * 3、element() 和 peek() 区别：
 * element() 和 peek() 用于在队列的头部查询元素。与 remove() 方法类似，在队列为空时， element() 抛出一个异常，而 peek() 返回 null。
 */
public class N225 {
    //输入队列
    Queue<Integer> q1;
    //输出队列
    Queue<Integer> q2;

    public N225() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }

    /** 添加元素到栈顶 */
    /**
     * 先将x压入q1中，再将q2中的元素offer到q1中，那么新push的元素x就在队列的最前面，即q1是：x----q2，此时q2是空队列
     * 将q2与q1交换，完成后q1是空对列，q2是以新压入的元素x开头的队列，也是输出队列，此时q2正符合栈的特性，x元素是栈顶，后进先出
     *
     * @param x
     */
    public void push(int x) {
        //元素进入q1
        q1.offer(x);
        //将q2中的元素压入需要push的元素x后面，并删除q2中的元素
        while (!q2.isEmpty()){
            // poll()移除并返问队列头部的元素,如果队列为空，则返回null
            q1.offer(q2.poll());
        }
        //while执行完后，交换q1与q2
        Queue<Integer> temp;
        temp=q1;
        q1=q2;
        q2=temp;
    }


    //q2.poll()输出x，就是栈的特点后进先出
    public int pop() {
        return q2.poll();
    }

    /** 返回栈顶元素 */
    public int top() {
        //peek返回队列头部的元素,如果队列为空，则返回null
        return q2.peek();
    }

    public boolean empty() {
        return q2.isEmpty();
    }
}
