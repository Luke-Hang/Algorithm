package algorithm.algorithm.Sort;

import java.util.Arrays;

/**
 * @author xiehang
 * @create 2022-03-17 23:03
 * 归并排序
 * 1.尽可能的将一组数据拆分成两个元素相等的子组，并对每一个子组继续拆分，直到拆分后的每个子组的元素个数是1为止。
 * 2.将相邻的两个子组进行合并成一个有序的大组；
 * 3.不断的重复步骤2，直到最终只有一个组为止。
 */
public class Merge {
    //定义归并所需要的辅助数组
    private static int[] assist;

    //定义归并所需要的辅助数组
    public static void sort(int[] arr) {
        assist = new int[arr.length];
        int low = 0;//数组中最小索引
        int high = arr.length - 1;//数组中最大索引
        Split(arr, low, high);
    }

    /**
     * 对数组arr中的元素进行分组拆分
     */
    private static void Split(int[] arr, int low, int high) {
        if (low >= high) {//最小索引大于最大索引不正确，直接return
            return;
        }
        int mid = low + (high - low) / 2;//数组中间索引
        //递归将左半边排序数组拆分
        Split(arr, low, mid);
        //递归将右半边排序数组拆分
        Split(arr, mid + 1, high);

        //再把拆分好的分组进行归并
        merge(arr, low, mid, high);
    }

    /**
     * 对拆分好的数组进行归并
     *
     * @param arr
     * @param low
     * @param mid
     * @param high
     */
    private static void merge(int[] arr, int low, int mid, int high) {
        //low到mid这组数据和mid+1到high这组数据归并到辅助数组assist对应的索引处

        int i = low;//定义一个指针，指向assist数组中开始填充数据的索引
        int p1 = low;//定义一个指针，指向第一组数据的第一个元素
        //assist数组开始索引和第一组数据开始索引都是0，所以未=为low
        int p2 = mid + 1;//定义一个指针，指向第二组数据的第一个元素


        //p1是第一组数据，最大索引是mid，p2是第二组数据，最大索引是high,
        // 当2组数据中的任何一组数据全部填充到辅助数组时，另一组可直接复制到辅助数组，不需要在执行while循环
        while (p1 <= mid && p2 <= high) {
            //比较左边小组和右边小组中的元素大小，哪个小，就把哪个数据填充到assist数组中
            if (arr[p1] < arr[p2]) {
                //++表示数据填充完后，辅助数组和被复制数组索引都要向前移动一位
                assist[i++] = arr[p1++];
            } else {
                assist[i++] = arr[p2++];
            }
        }

        //上面的循环结束后，如退出循环的条件是p1<=mid，证明左边小组中的数据已归并完毕，如果退出循环的条件是p2<=hi,证明右边小组的数据已填充完毕
        //所以需要把未填充完毕的数据继续填充到assist中,//下面两个循环，只会执行其中的一个

        //左边小组未归并完。将数据填充到辅助数组
        while (p1 <= mid) {
            assist[i++] = arr[p1++];
        }

        //右边小组未归并完。将数据填充到辅助数组
        while (p2 <= high) {
            assist[i++] = arr[p2++];
        }
        //到现在为止，assist数组中，从low到high的元素是有序的，再把数据拷贝到arr数组中对应的索引处
        for (int j = low; j <= high; j++) {
            arr[j] = assist[j];
        }
        System.out.println(Arrays.toString(assist));
    }
}
