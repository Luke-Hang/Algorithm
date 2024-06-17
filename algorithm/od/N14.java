package algorithm.algorithm.od;

/**
 * @author xiehang
 * @create 2022-12-27 10:54
 * 最长公共前缀
 * https://leetcode.cn/problems/longest-common-prefix/
 */
public class N14 {
    public static void main(String[] args) {
//        String[] strs = {"flower","flow","flight"};
        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        //假设第一个元素为公共前缀
        String prefix=strs[0];
        for (String str : strs) {
            //当某个字符串不以公共前缀开头，说明公共前缀太长，剪短公共前缀，在进行匹配
            while (!str.startsWith(prefix)){
               prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
