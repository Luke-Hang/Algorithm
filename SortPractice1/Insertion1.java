package  algorithm.SortPractice1;

/**
 * @author xiehang
 * @create 2022-03-26 10:39
 */
public class Insertion1 {
    public static void Insertion1Sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >0; j--) {
                int temp;
                if (arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }else{
                    break;
                }
            }
        }
    }
}
