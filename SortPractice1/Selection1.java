package  algorithm.SortPractice1;

/**
 * @author xiehang
 * @create 2022-03-25 9:38
 */
public class Selection1 {
    public static void selection1Sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            int temp;
            temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
}
