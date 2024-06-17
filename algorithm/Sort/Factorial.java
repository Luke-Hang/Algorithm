package algorithm.algorithm.Sort;

/**
 * @author xiehang
 * @create 2022-03-17 9:10
 * 递归
 */
public class Factorial {
    public static void main(String[] args) {
        int factor = factor(1000000000);
        System.out.println(factor);
    }

    private static int factor(int n) {
        //边界条件，让递归结束
        if (n == 1) {
            return 1;
        }
        //5!=5*4!,所以n!=n*(n-1)!,而factor()正是求某个数阶乘的方法，所以求n-1的阶乘就可直接调用自己，参数是n-1即可
        return n * factor(n - 1);
    }
}
