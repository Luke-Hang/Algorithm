package algorithm.algorithm.DynamicProgramming;

/**
 * @author xiehang
 * @date 2023/1/19 11:25
 * https://leetcode.cn/problems/is-subsequence/
 * 判断子序列
 * 输入：s = "abc", t = "ahbgdc"
 * 输出：true
 */
public class N392 {
    public static void main(String[] args) {
        String s = "acb";
        String t = "ahbgdc";
//        System.out.println(isSubsequence(s, t));
        //返回字符ch在字符串中由fromIndex位置开始搜索的第一次出现处索引，找不到则返回-1
        //返回字符w在字符串中由fromIndex位置开始搜索的第一次出现处索引，找不到则返回-1
//        System.out.println(t.indexOf('w',0));//输出-1
        System.out.println(isSubsequence(s, t));

    }

    public static boolean isSubsequence(String s, String t) {
        char[] chars = s.toCharArray();
        int index = -1;
        for (char ch : chars) {
            //返回字符ch在字符串中由fromIndex位置开始搜索的第一次出现处索引，找不到则返回-1
            //index控制了检索索引，保证了s一定是t的子序列
            //当检索到字符c的时候，index是5，那么下一次检索的开始索引就是index=5+1，
            // 即字符串t从索引6开始检索字符b，肯定检索不到，所以index返回-1，说明s就不是t的子序列
            index = t.indexOf(ch, index + 1);
            if (index == -1) {
                return false;
            }
        }
        return true;
    }
}
