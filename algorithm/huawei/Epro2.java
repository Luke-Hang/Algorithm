package algorithm.algorithm.huawei;

import java.util.Scanner;

/**
 * @author xiehang
 * @date 2023/4/17 17:07
 * DFJEIWFNQLEF0395823048+_+JDLSFJDLSJFKK
 * dfjeiwfnqlef0395823048+_+jdlsfjdlsjfkk
 */
public class Epro2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.nextLine().toCharArray();
        int[] counts = new int[256];
        for (char ch : chars) {
            counts[ch]++;
        }

        getUpperLetter(counts);
//        getLowrLetter(counts);
    }

    /**
     * 统计A-Z大写字母出现的次数
     * @param counts
     */
    private static void getUpperLetter(int[] counts) {
        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.println((char) i + ":" + counts[i]);
        }
    }

    /**
     * 统计a-z小写字母出现的次数
     * @param counts
     */
    private static void getLowrLetter(int[] counts) {
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.println((char) i + ":" + counts[i]);
        }
    }
}
