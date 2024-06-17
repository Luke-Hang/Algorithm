package algorithm.algorithm.huawei;

import java.util.Scanner;

/**
 * @author xiehang
 * @create 2022-04-18 22:40
 *  计算某字符出现次数
 *  输入：ABCabc
 *       A
 *  输出：2
 */
public class HJ2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        //将输入的字符串全转化为大写
//        String replace = s1.toUpperCase().replace(s2.toUpperCase(), "");
        //将输入的字符串全转化为小写
        String replace = s1.toLowerCase().replace(s2.toLowerCase(), "");
        int count = s1.length() - replace.length();
        System.out.println(count);
    }
}
