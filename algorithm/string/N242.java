package algorithm.algorithm.string;

import java.util.Arrays;

/**
 * @author xiehang
 * @date 2023/1/30 10:18
 * https://leetcode.cn/problems/valid-anagram/
 */
public class N242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
//        System.out.println(isAnagram2(s, t));
    }

    /**
     * 解法一
     */
    public static boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        //两个字符数组相等，即为有效的字母异位词
        return Arrays.equals(sChars, tChars);
    }

    /**
     * 解法二
     */
    public static boolean isAnagram2(String s, String t) {
        int[] sInts = s.chars().sorted().toArray();
        int[] tInts = t.chars().sorted().toArray();
        return Arrays.equals(sInts,tInts);
    }
}
