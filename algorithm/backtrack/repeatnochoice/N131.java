package algorithm.algorithm.backtrack.repeatnochoice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiehang
 * @date 2023/1/12 15:29
 * https://leetcode.cn/problems/palindrome-partitioning/
 * 输入：s = "aab"
 * 输出：[["a","a","b"],["aa","b"]]
 */
public class N131 {
    public static List<List<String>> res = new ArrayList<>();
    public static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
//        String s = "aab";
        String s = "abc";
        partition(s);
    }

    public static List<List<String>> partition(String s) {
        backtrack(s, 0);
        return res;
    }

    private static void backtrack(String s, int start) {
        //如果起始索引start为0 >=s.length(),说明遍历到了叶子节点，s无法继续切割
        if (start >= s.length()) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            //s.substring(0, 0)输出的字符串是空的，s.substring(0, 1)才能拿到数据，所以这里是i+1
            String str = s.substring(start, i + 1);
            if (isPalindrome(str)) {
                list.add(str);
            } else {
                continue;
            }
            backtrack(s, i + 1);
            //删除最后一个元素后，i还是最后一个元素的索引，这里是2，当再次删除最后一个元素的时候i-1,是回溯后第一次删除元素的倒数第二个索引
            //当i=2时，元素start=i+1退出递归，所以第一次撤回i是2，第2次撤回i是1，最顶端元a素不再撤回，继续走循环i++时2，
            // s.substring(2, 2 + 1)==s.substring(2,3)
            list.remove(list.size() - 1);
        }
    }

    /**
     * 此方法效率高
     * 判断字符串是否是回文字符串"a","b"单独的字符串也是回文字符串
     */
    private static boolean isPalindrome2(String str) {
        int end = str.length() - 1;
        for (int i = 0; i < end; i++) {
            if (str.charAt(i) != str.charAt(end)) {
                return false;
            }
            end--;
        }
        return true;
    }

    /**
     * 效率较低
     */
    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //java.lang.Character.isLetterOrDigit(char ch) 确定指定的字符是否为字母或数字
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}
