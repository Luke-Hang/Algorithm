package algorithm.algorithm.recursion;

/**
 * @author xiehang
 * @date 2023/1/4 22:26
 */
public class RecursionDemo2 {
    public static void main(String[] args) {
        test(4);
    }
    private static void test(int n) {
        //1.递归方法的出口n>2
        if (n > 2) {
            //2.每次递归调用都要缩小范围，向出口条件靠拢,即向出口条件递
            test(n - 1);
        }
        //当出口方法结束后，在进行归
        System.out.println("n=" + n);
    }
}
