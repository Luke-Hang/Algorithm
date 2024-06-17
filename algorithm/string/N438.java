package algorithm.algorithm.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xiehang
 * @date 2023/1/30 12:04
 * https://leetcode.cn/problems/find-all-anagrams-in-a-string/
 * 找到字符串中所有字母异位词
 */
public class N438 {
    public static void main(String[] args) {
//        String s = "cbaebabacd", p = "abc";
        String s = "abab", p = "ab";
        findAnagrams(s, p);
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int lengthS = s.length();
        int lengthP = p.length();
        //创建一个和p一样长的窗口,统计各自字符的数量
        int[] countS = new int[26];
        int[] countP = new int[26];
        //初始化数组
        //在长度为26的int数组target中存储字符串p中对应字符（a~z）出现的次数
        //如p="abc",则target为[1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
        //如p="bbdfeee",则target为[0,2,0,1,3,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
        for (int i = 0; i < lengthP; i++) {
            countS[s.charAt(i) - 'a']++;
            countP[p.charAt(i) - 'a']++;
        }

        //如果两个初始化的数组相等，则起始索引就是0
        if (Arrays.equals(countS, countP)) {
            list.add(0);
        }

        for (int i = 0; i < lengthS; i++) {
            //循环中i逐渐增加，那么i-lengthP也就是逐渐增加的，相当于左窗口
            countS[s.charAt(i - lengthP) - 'a']--;
            //右窗口向右滑动
            countS[s.charAt(i) - 'a']++;
            if (Arrays.equals(countS, countP)) {
                //起始索引，左指针被抛弃了，所以起始索引+1
                list.add(i - lengthP + 1);
            }
        }
        return list;
    }
}
