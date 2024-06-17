package algorithm.algorithm.od;

import java.util.Arrays;

/**
 * @author xiehang
 * @date 2022/12/30 10:18
 * 判断能否形成等差数列
 * https://leetcode.cn/problems/can-make-arithmetic-progression-from-sequence/
 *
 */
public class N1502 {
    public static void main(String[] args) {
        int[] arr={3,5,1};
        System.out.println(canMakeArithmeticProgression(arr));
    }

    /**
     * 思路
     * a[i]*2=a[i-1]+a[i+1];
     * @param arr
     * @return
     */
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i]*2!=arr[i-1]+arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
