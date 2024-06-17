package algorithm.algorithm.huawei;

import java.util.Scanner;

/**
 * @author xiehang
 * @create 2022-04-25 17:22
 */
public class HJ11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        String str = String.valueOf(num);
        getStr(str);
    }

    /**
     * 解法一
     * @param str
     */
    private static void getStr(String str) {
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.append(str).reverse().toString());
    }


    /**
     * 解法二
     * @param str
     */
//    private static void getStr(String str) {
//        for (int i = str.length()-1; i >=0 ; i--) {
//            System.out.print(str.charAt(i));
//        }
//    }
}
