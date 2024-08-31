package algorithm.algorithm.binarySearch;

/**
 * @author xiehang
 * @create 2022-02-18 9:05
 */
public class NumArray {
    //定义前缀数组和
    private int[] preSum;

    public NumArray(int[] nums) {
        preSum=new int[nums.length+1];
        //计算nums累加和,核心思路是我们new一个新的preSum数组，preSum[i]记录nums[0......i-1]的累加和
        for (int i = 1; i <preSum.length ; i++) {
            preSum[i]=preSum[i-1]+nums[i-1];
        }
    }
    //preSum[right+1]存储的是nums[0-right]的累加和，减去存储nums[0....left-1]的累加和即preSum[left],就是left-right的累加和
    public int sumRange(int left, int right) {
        return preSum[right+1]-preSum[left];
    }
}
