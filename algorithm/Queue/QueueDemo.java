package algorithm.algorithm.Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author xiehang
 * @date 2024/8/10 11:20
 *
 * 队列：先入先出
 */
public class QueueDemo {
    public static void main(String[] args) {
        /* 初始化队列 */
        Queue<Integer> queue=new LinkedList<>();

        /* 元素入队 */
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        Integer peek = queue.peek();
        System.out.println("队首元素为：" + peek);

        /* 元素出队 */
        Integer poll = queue.poll();
        System.out.println("队首元素出队，出队元素为：" + poll);


        /* 获取队列的长度 */
        int size = queue.size();
        System.out.println("队列长度为：" + size);

        /* 判断队列是否为空 */
        boolean empty = queue.isEmpty();
        System.out.println("队列是否为空：" + empty);

    }
}
