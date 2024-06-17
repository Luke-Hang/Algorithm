package algorithm.algorithm.slidingwindow;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xiehang
 * @date 2023/2/2 11:59
 * https://leetcode.cn/problems/longest-substring-without-repeating-characters/
 */
public class N03 {
    public static void main(String[] args) {
//        String s = "abcabcbb";
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int max = 0;
        //维护当前最长不重复字符子串
        Set<Character> set = new HashSet<>();
        while (right < s.length()) {
            //未查到重复字符就一直加，右指针right右移
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
            } else {
                //例如：pwwkew right查到重复字符先不动，left右移，set删除left经过的字符，直到重复的这个字符删掉为止，
                // 然后开始重新计算子字符串长度
                set.remove(s.charAt(left));
                left++;
            }
            //每次循环都更新最大值，保证即使set删除了left经过的字符，下一次重新计算即使比当前小，仍能将原来的最大值保存住
            max = Math.max(max, set.size());
        }
        return max;
    }
}