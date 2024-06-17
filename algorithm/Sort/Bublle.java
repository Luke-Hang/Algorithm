package algorithm.algorithm.Sort;

import java.util.Arrays;

/**
 * @author xiehang
 * @create 2022-03-08 9:45
 * 冒泡排序
 */
public class Bublle {
    public static void main(String[] args) {
        int[] arr = {3,9,-1,10,-2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 1. 比较相邻的元素。如果前一个元素比后一个元素大，就交换这两个元素的位置。
     * 2. 对每一对相邻元素做同样的工作，从开始第一对元素到结尾的最后一对元素。最终最后位置的元素就是最大值。
     */
    public static void sort(int[] arr) {
        //int i = arr.length-1从末尾开始排序
        //i>0表示至少有一个元素参与冒泡
        //每循环一次，最大元素或最小元素已经排到对应的位置，此时只需要对剩下的元素进行冒泡排序，所以i--
        for (int i = arr.length - 1; i > 0; i--) {
            //j从0开始，最大到每次参与冒泡排序的最大索引处，每次参与冒牌排序的最大索引就是i，所以j<i,
            for (int j = 0; j < i; j++) {
                //arr[j+1]就是每次参与冒泡的最大元素也就是arr[i],所以j<i
                //开始冒泡，比较相邻元素的大小，将最大元素放到最后一位，j从0开始到i每循环一次,就可以将最大元素放到对应的位置
                //比较相邻元素的大小
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
