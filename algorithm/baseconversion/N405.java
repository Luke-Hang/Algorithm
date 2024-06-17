package algorithm.algorithm.baseconversion;

/**
 * @author xiehang
 * @create 2022-04-25 9:27
 * 数字转换为十六进制数
 * https://leetcode-cn.com/problems/convert-a-number-to-hexadecimal/
 */
public class N405 {
    public static void main(String[] args) {
        int num=10;
        System.out.println(toHex(10));
    }
    public static String toHex(int num) {
        return Integer.toString(num, 16);
    }
}
