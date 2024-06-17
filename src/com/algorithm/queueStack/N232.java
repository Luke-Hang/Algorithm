package com.algorithm.queueStack;

import java.util.Stack;

/**
 * @author xiehang
 * @create 2022-04-16 10:15
 * 232. 用栈实现队列
 * https://leetcode-cn.com/problems/implement-queue-using-stacks/
 * ⽤栈结构实现了⼀个队列，核⼼思想是利⽤两个栈互相配合。
 * 将第一个栈s1中的元素取出来，压入第二个栈s2，从s2进行出栈操作，相当于把s1中的元素进行顺序反转，压入到了s2中
 * 那么s2出栈顺序刚好就是s1中元素入栈顺序
 * s1入栈123，出栈321
 * s2入栈321，出栈123
 * 就符合队列的特点先进先出
 */
public class N232 {
    //输入栈
    private Stack<Integer> s1;
    //输出栈
    private Stack<Integer> s2;

    public N232() {
        s1=new Stack<>();
        s2=new Stack<>();
    }

    /** 添加元素到队尾 */
    public void push(int x) {
        s1.push(x);
    }

    /** 删除队头的元素并返回 */
    public int pop() {
        // 先调⽤ peek 保证 s2 ⾮空
        peek();
        return s2.pop();//pop()方法用于从此Stack中返回顶部元素，并通过删除来检索元素
    }

    /** 返回队头元素 */
    public int peek() {
        if (s2.isEmpty()){
            while (!s1.isEmpty()){
                //将s1中的元素取出来，压入s2中
                s2.push(s1.pop());//pop()方法用于从此Stack中返回顶部元素，并通过删除来检索元素
            }
        }
        //peek()方法用于从此Stack中返回顶部元素，并且它不删除只检索元素
        return s2.peek();
    }

    //如何判断队列是否为空呢？如果两个栈都为空的话，就说明队列为空：
    public boolean empty() {
        return s1.empty()&&s2.empty();
    }
}
