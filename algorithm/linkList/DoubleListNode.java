package algorithm.algorithm.linkList;

/**
 * @author xiehang
 * @date 2024/8/10 10:19
 */
public class DoubleListNode {

    /**
     * 节点值
     */
    int val;
    /**
     * 指向后续节点的引用
     */
    DoubleListNode next;

    /**
     * 指向前驱节点的引用
     */
    DoubleListNode prev;

    /**
     * 构造函数
     * @param x
     */
    DoubleListNode(int x) {
        val = x;
    }
}
