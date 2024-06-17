package algorithm.algorithm.Sort;

import java.util.Arrays;

/**
 * @author xiehang
 * @create 2022-03-16 9:31
 * 插入排序
 * 1.把所有的元素分为两组，已经排序的和未排序的；
 * 2.找到未排序的组中的第一个元素，向已经排序的组中进行插入；
 * 3.倒叙遍历已经排序的元素，依次和待插入的元素进行比较，直到找到一个元素小于等于待插入元素，那么就把待插入元素放到这个位置，其他的元素向后移动一位；
 */
public class Insertion {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 10, 12, 1, 5, 6};
        //此循环表示未分组元素
        //i=1,默认已分组元素是i=0，那么未分组元素从索引1开始，最大到数组最后一位，所以i < arr.length
        for (int i = 1; i < arr.length; i++) {
            //此循环表示已分组元素
            //未排序组中的第一个元素就i，要拿此元素和已分组元素做对比，所以j=i。
            //已分组元素倒叙遍历且最小索引是0，所以j--,且j>0
            for (int j = i; j > 0; j--) {
                //比较索引j-1与索引j处的值，如果j-1比j处的值大，则需要交换数据，如果不大那么就找到了合适的位置，不需要交换，退出循环即可
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else {
                    //比已分组最大元素都大，就不需要再比较了，该元素位置正确，不需要动，本次插入排序就完了，直接退出循环
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
