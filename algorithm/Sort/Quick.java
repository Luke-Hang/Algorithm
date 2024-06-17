package algorithm.algorithm.Sort;

import java.util.Arrays;

/**
 * @author xiehang
 * @create 2022-03-20 15:12
 * 快速排序
 */
public class Quick {

    public static void main(String[] args) {
        int[] arr={6, 1, 2, 7, 9, 3, 4, 5, 8};
        int low=0;
        int high=arr.length-1;
        sort(arr,low,high);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int low, int high) {
        //安全性校验
        if (low>=high){
            return;
        }

        //对数组中，从low到high的元素进行切分并排序,返回的split就是一次排序后基准值索引
        int split = split(arr, low, high);
        //递归对左边分组中的元素进行排序
        sort(arr, low, split-1);
        //递归对右边分组中的元素进行排序
        sort(arr, split+1, high);
    }

    private static int split(int[] arr, int low, int high) {
        //把最左边的元素当做基准值
        int key=arr[low];
        int left=low;//定义一个左侧指针，初始指向最左边的元素
        int right=high+1;//定义一个右侧指针，初始指向右侧的元素下一个位置,+1的原因是为了让--right指向的是数组最右边元素索引

        //进行切分
        while (true){

            //先从右往左扫描，找到一个比基准值小的元素
            while (true){//先从右往左扫描，找到了比基准值小的元素，循环停止,//不知道循环次数，所以用while循环
                if (arr[--right]<key){
                    break;
                }

                if (right==low){
                    break;//已经扫描到最左边了，无需继续扫描，结束循环
                }
            }


            //再从左往右扫描，找到一个比基准值大的元素,第一个是索引基准值，所以从第二个索引开始即++left
            while (true){//再从左往右扫描，找到了比基准值大的元素，循环停止,//不知道循环次数，所以用while循环
                if (arr[++left]>key){
                    break;
                }

                if (left==high){
                    break;//已经扫描到最右边了，无需继续扫描，结束循环
                }
            }

            if (left>=right){
                //扫描完了所有元素，结束循环
                break;
            }else {
                //交换left和right索引处的元素
                exchange(arr, left, right);
            }
        }
        //最后,当left>=right时即left和right共同指向同一个索引，交换此索引和基准值索引处的值
        exchange(arr, low, right);//此处写right或left都可以，因为此时left=right
        return right;
    }

    /**
     * 交换两个元素
     * @param arr
     * @param left
     * @param right
     */
    private static void exchange(int[] arr, int left, int right) {
        int temp;
        temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}
