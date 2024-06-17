package algorithm.algorithm.huawei;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author xiehang
 * @create 2022-04-26 11:33
 * 求int型正整数在内存中存储时1的个数---输入一个 int 型的正整数，计算出该 int 型数据在内存中存储时 1 的个数
 * 思路：数据在内存中是以01的二进制形式存在的，将输入的数据转换为2进制，统计1的个数即可
 */
public class HJ15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        String str = Integer.toString(num, 2);
        getLenth(str);
        getleng1(str);
    }


    /**
     * 解法一
     * @param s
     */
    private static void getLenth(String s) {
        String replace = s.replace("0", "");
        System.out.println(replace.length());
    }

    /**
     * 解法二
     * @param s
     */
    private static void getleng1(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        System.out.println(count);
    }
}
