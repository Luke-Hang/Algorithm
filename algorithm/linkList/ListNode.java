package algorithm.algorithm.linkList;

/**
 * @author xiehang
 * @create 2022-03-29 22:53
 */
public class ListNode {
        int val;// 节点值
        public ListNode next;// 指向下一节点的引用
        public ListNode(int x) { val = x; }// 构造函数

        // 链表节点的构造函数
        // 使用arr为参数，创建一个链表，当前的ListNode为链表头节点
        public ListNode(int[] arr){
            if(arr == null || arr.length == 0){
//                throw new IllengalArgumentException("arr can not be empty");
            }

            this.val = arr[0];
            ListNode cur = this;
            for(int i = 1; i < arr.length; i ++){
                cur.next = new ListNode(arr[i]);
                cur = cur.next;
            }
        }

        //以当前节点为头节点的链表信息字符串 方便查看
        @Override
        public String toString(){
            StringBuilder res = new StringBuilder();
            ListNode cur = this;
            while(cur != null){
                res.append(cur.val + "->");
                cur = cur.next;
            }
            res.append("NULL");
            return res.toString();
        }

    /* 在链表的节点 n0 之后插入节点 P */
    void insert(ListNode n0, ListNode P) {
        ListNode n1 = n0.next;
        P.next = n1;
        n0.next = P;
    }


    /* 删除链表的节点 n0 之后的首个节点 */
    void remove(ListNode n0) {
        if (n0.next == null) {
            return;
        }
        // n0 -> P -> n1
        ListNode P = n0.next;
        ListNode n1 = P.next;
        n0.next = n1;
    }

    /* 访问链表中索引为 index 的节点 */
    ListNode access(ListNode head, int index) {
        for (int i = 0; i < index; i++) {
            if (head == null) {
                return null;
            }
            //head.next获取的新head就是下一个节点对象
            head = head.next;
        }
        return head;
    }

    /* 在链表中查找值为 target 的首个节点 */
    int find(ListNode head, int target) {
        int index = 0;
        while (head != null) {
            if (head.val == target) {
                return index;
            }
            head = head.next;
            index++;
        }
        return -1;
    }
}
