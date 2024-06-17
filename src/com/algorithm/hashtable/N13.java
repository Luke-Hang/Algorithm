package com.algorithm.hashtable;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author xiehang
 * @create 2022-04-27 11:04
 * 罗马数字转整数
 * https://leetcode-cn.com/problems/roman-to-integer/
 */
public class N13 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);;
//        String s = sc.nextLine();
        String s = "IV";

        int sum = romanToInt(s);
        System.out.println(sum);
    }

    /**
     * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做IIII，而是IV。数字 1 在数字 5 的左边，所表示的数等于
     * 大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为IX。这个特殊的规则只适用于以下六种情况：
     * I可以放在V(5) 和X(10) 的左边，来表示 IV 4 和 IX 9。
     * X可以放在L(50) 和C(100) 的左边，来表示XL 40 和XC 90。
     * C可以放在D(500) 和M(1000) 的左边，来表示CD 400 和CM 900。
     */
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = getCharacterIntegerHashMap();
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            //获取str中每个字符对应的数字
            Integer value = map.get(s.charAt(i));
            //i < s.length() - 1防止str.charAt(i + 1)索引越界
            //value < map.get(s.charAt(i + 1))小数字在大数字左边,如IV,IX
            if (i < s.length() - 1 && value < map.get(s.charAt(i + 1))) {
                sum-=value;
                //IV sum=1-0=1;sum=5-1=4
//                sum=value-sum;
            }else {
                sum+=value;
//                sum=value+sum;
            }
        }
        return sum;
    }

    private static HashMap<Character, Integer> getCharacterIntegerHashMap() {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;
    }
}
