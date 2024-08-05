package algorithm.algorithm.recursion;

/**
 * @author xiehang
 * @date 2023/1/4 21:50
 */
public class RecursionDemo {
    public static void main(String[] args) {
        int n = sum(1, 3);
        System.out.println(n);
    }

    /**
     * 统计start-end的累加和
     */
    private static int sum(int start, int end) {
        //1.递归方法的出口
        //当start==end时，他们等于3，球的时3-3的累加和，就是3，所以返回end
        if (start == end) {
            return end;
        }
        //2.每次递归调用都要向出口条件靠拢,即向出口条件递
        //当return end，按照入栈顺序再归出栈
        //递 1+sum(2,3)----2+sum(3,3)----return 3
        //归 3         ----2+3     ----1+(2+3)
        int res = start + sum(start + 1, end);
        return res;
    }
}
