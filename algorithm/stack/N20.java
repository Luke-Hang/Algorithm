package algorithm.algorithm.stack;

import java.util.*;

/**
 * @author xiehang
 * @create 2022-12-16 14:15
 * https://leetcode.cn/problems/valid-parentheses/
 */
public class N20 {
    //    boolean empty( )：如果堆栈是空的，则返回true，当堆栈包含元素时，返回false。
//    Object peek( )：返回位于栈顶的元素，但是并不在栈中删除它。
//    Object pop( )：返回位于栈顶的元素，并在进程中删除它。
//    Object push (Object element )：将element压入堆栈，同时也返回element。
//    int search(Object element)：在堆栈中搜索element，如果发现了，则返回它相对于栈顶
    public static void main(String[] args) {
        String s = "()[]{}";
        if (s.length() > 0) {
            System.out.println(isValid(s));
        }
    }

    public static boolean isValid(String s) {
        //输入的字符串是奇数，括号不可能成对出现，所以返回false
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

//        String s = "()[]{}";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            //map中有该元素，第二个元素是)，map中有该元素的key
            if (!map.containsKey(ch)) {
                //map中没有该元素，将该元素压入栈中.第一个元素是(，map中没有，将其压入栈stack中
                stack.push(ch);
            } else {
                //Object peek( )：返回位于栈顶的元素，但是并不在堆栈中删除它。stack.peek()返回的是(，
                // 此时map.get(ch)就是map.get(')')==(，如果不等于就说明括号不对称
                //stack.isEmpty()判断栈是否是空的，可以防止stack.peek()空指针
                if (stack.isEmpty() || stack.peek() != map.get(ch)) {
                    return false;
                }
                //Object pop()：返回位于栈顶的元素，并在进程中删除它。
                stack.pop();
            }
        }
        //括号都是对称的，那么栈中的值最终会被stack.pop()删除完，所以栈一定是空的
        return stack.isEmpty();
    }
}