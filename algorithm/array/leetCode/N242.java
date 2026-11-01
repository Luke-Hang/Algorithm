package algorithm.algorithm.array.leetCode;

import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//https://leetcode.cn/problems/valid-anagram/description/
public class N242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        boolean result = true;
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            if (!map.containsKey(charAt)) {
                map.put(charAt, 1);
            } else {
                map.put(charAt, map.get(charAt) + 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char chr = t.charAt(i);
            if (map.containsKey(chr)) {
                map.put(chr, map.get(chr) - 1);
            } else {
                result = false;
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                result = false;
            }
        }
        return result;
    }
}
