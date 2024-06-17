package algorithm.algorithm.dichotomy;

/**
 * @author xiehang
 * @create 2022-08-29 12:11
 */
public class Offer0803 {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3};
        int[] nums = {0, 0, 0};
//        int[] nums = {0, 2, 3, 4, 5};
        System.out.println(findMagicIndex(nums));
    }

    /**
     *
     * @param nums
     * @return
     */
/*    public static int findMagicIndex(int[] nums) {
        int left=0;
        int rigth=nums.length-1;
        int ans=-1;
        while (left<=rigth){
            int mid=left+(rigth-left)/2;
            //nums[mid]较小，向右收缩
            if (nums[mid]<mid){
                left=mid+1;
            }else if (nums[mid]>mid){
            //nums[mid]较大，向左收缩
                rigth=mid-1;
            }else {
                //nums[mid]=mid
                ans=mid;
                break;
            }
        }
        return ans;
    }*/

    public static int findMagicIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==i){
                return i;
            }
        }
        return -1;
    }
}
