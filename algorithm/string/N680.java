package algorithm.algorithm.string;

/**
 * @author xiehang
 * @date 2023/1/30 16:46
 * https://leetcode.cn/problems/valid-palindrome-ii/
 */
public class N680 {
    public static void main(String[] args) {
        String s = "abca";
        System.out.println(validPalindrome(s));
    }

    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isValid(s, left, right - 1) || isValid(s, left + 1, right);
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean isValid(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
