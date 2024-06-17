package com.algorithm.od;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xiehang
 * @create 2022-12-26 12:01
 * 最长回文串
 * https://leetcode.cn/problems/longest-palindrome/
 */
public class N409 {
    public static void main(String[] args) {

//        int as = longestPalindrome("abccccdd");
        int as = longestPalindrome("babad");
        System.out.println(as);
    }

/*    public static int longestPalindrome(String s) {
        int[] arr = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            arr[charAt]++;
        }

        int ans = 0;
        for (int v : arr) {
            ans += v / 2 * 2;
            if (v % 2 == 1 && ans % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }*/

    public static int longestPalindrome(String s){
        Set<Character> set=new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            //在set中删除能找到的元素，如果删除失败则说明该set中没有该元素，则将该元素加入到set中
            if (!set.remove(s.charAt(i))){
                set.add(s.charAt(i));
            }
        }
        //总长度减去set的长度就是无法成对出现的元素个数
        int res=s.length()-set.size();
        //set.size() == 0说明元素都是成对出现的，res + 1就是成对出现的元素个数在加上中心元素即为回文数长度
        int n = set.size() == 0 ? res : res + 1;
        return n;
    }
}
