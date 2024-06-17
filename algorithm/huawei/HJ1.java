package algorithm.algorithm.huawei;

import java.util.Scanner;

/**
 * @author xiehang
 * @create 2022-04-18 22:35
 * 字符串最后一个单词的长度
 * 思路：将输入的字符串用空格切割后形成一个数组，数组最后一个元素的索引就是strings.length - 1
 */
public class HJ1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        String[] strings = str.split(" ");
        int i = strings.length - 1;
        System.out.println(strings[i].length());
    }
}
