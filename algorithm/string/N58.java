package algorithm.algorithm.string;

/**
 * @author xiehang
 * @date 2023/1/30 10:09
 * https://leetcode.cn/problems/length-of-last-word/
 */
public class N58 {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        String[] strs = s.split(" ");
        //最后一个单词的索引就是数组strs的长度-1即strs.length - 1
        // strs[strs.length - 1]就是获取最后一个元素
        return strs[strs.length - 1].length();
    }
}
