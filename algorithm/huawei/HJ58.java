package algorithm.algorithm.huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author xiehang
 * @create 2022-04-17 22:26
 * 输入n个整数，输出其中最小的k个
 * 第一行输入两个整数n和k
 * 第二行输入一个整数数组
 */
public class HJ58 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
