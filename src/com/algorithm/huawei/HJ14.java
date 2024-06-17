package com.algorithm.huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author xiehang
 * @create 2022-04-26 10:02
 * Arrays.sort()
 * 对基本数据类型的数组都可以排序，并且可以实现对对象数组的排序.
 * 1.基本数据类型
 * 	1.1数字类型：从小到大排序(浮点类型与整形同理)
 * 	1.2字符串类型:将字符串的开头字母进行排序,排列顺序为:
 * 		大写在小写前,从A~Z依次往下排,若第一位相同则比较第二位,规则相同,若第三位也相同,依次往下比较。
 *      还有一种按照字母表排序,忽略大小写的方式
 *
 *   知识点2
 *   nextInt()只会读取数值，剩下"\n"回车还没有读取，读取结果是""字符串。
 *   nextLine()会读取"\n"回车，并结束
 *   1. int n = sc.nextInt();先读取数值
 *      String s = sc.nextLine();在读取回车
 *   2.int n = Integer.valueOf(sc.nextLine());读取数值和回车
 *      1等价于2
 *
 *  本题思路：将输入的数据存入数组arr中，采用 Arrays.sort(arr);对数组进行排序
 */
public class HJ14 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //输入的字符串个数n
        int n = sc.nextInt();
        String s = sc.nextLine();
//        int n = Integer.valueOf(sc.nextLine());
        String[] arr=new String[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextLine();
        }
        //对字符串进行排序
        Arrays.sort(arr);
        for (String str : arr) {
            System.out.println(str);
        }
    }
}
