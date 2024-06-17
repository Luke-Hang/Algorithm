package algorithm.algorithm.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiehang
 * @create 2022-05-18 9:17
 *  同构字符串
 *  https://leetcode.cn/problems/isomorphic-strings/
 */
public class N205 {
    public static void main(String[] args) {
        String s="foo";
        String t="bar";
        System.out.println(isIsomorphic(s,t));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char m = s.charAt(i);
            char n = t.charAt(i);
            //map1中有m,但m对应的value不是映射n，则返回false
            boolean booleanS = map1.containsKey(m) && map1.get(m) != n;
            //map2中有n,但n对应的value不是映射m，则返回false
            boolean booleanT = map2.containsKey(n) && map2.get(n) != m;
            if (booleanS || booleanT) {
                return false;
            }
            //map1保存s[i] 到 t[j]的映射
            map1.put(m,n);
            //map2保存s[i] 到 t[j]的映射
            map2.put(n,m);
        }
        //输入空字符串，也算是同构字符串，返回true
        return true;
    }
}
