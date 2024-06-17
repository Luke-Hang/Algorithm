package algorithm.algorithm.test;

import java.util.Stack;

/**
 * @author xiehang
 * @create 2022-12-16 12:22
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();

        //将element压入堆栈，同时也返回element
        stack.push("Welcome");
        stack.push("To");
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");

        //如果堆栈是空的，则返回true，当堆栈包含元素时，返回false
        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}
