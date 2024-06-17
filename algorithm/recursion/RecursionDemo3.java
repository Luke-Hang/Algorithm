package algorithm.algorithm.recursion;

/**
 * @author xiehang
 * @date 2023/1/4 22:53
 */
public class RecursionDemo3 {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    private static int factorial(int n) {
        //1.递归方法的出口
        //1的阶乘就是1，所以返回1
        if (n == 1) {
            return 1;
        } else {
            //2.每次递归调用都要向出口条件靠拢,即向出口条件递
            //递 3*factorial(2)------2*factorial(1)------factorial(1)=1
            //归 factorial(1)=1------factorial(1)*2=1*2--factorial(2)*3=1*2*3
            return n * factorial(n - 1);
        }
    }
}
