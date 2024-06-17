package algorithm.algorithm.huawei;

import java.util.Scanner;

/**
 * @author xiehang
 * @create 2022-04-25 15:09
 * HJ6 质数因子
 */
public class HJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        //求平方根
        long sqrt = (long) Math.sqrt(num);

        for (int i = 2; i <= sqrt; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num = num / i;
            }
        }
        System.out.println(num == 1 ? "" : num + " ");
    }
}
