package algorithm.algorithm.dichotomy;

/**
 * @author xiehang
 * @create 2022-03-05 16:28
 */
//构建差分数组
public class Difference {
    private int[] diff;

    //输入一个初始数组，区间操作将在这个数组中进行
    public Difference(int nums[]) {
        assert nums.length > 0;
        //根据初始数组构建差分数组
        diff[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            diff[i] = nums[i] - nums[i - 1];
        }
    }

    //给闭区间[i,j]加val
    public void increment(int i, int j, int val) {
        //意味着给nums[i.....]所有元素都加了val
        diff[i] = diff[i] + val;
        if (j + 1 < diff.length) {
            //意味着nums[j+1....]所有元素都减了3
            diff[j + 1] = diff[j + 1] - val;
        }
        //相当于只给nums[i,j]加了val
    }

    //返回结果数组
    public int[] result() {
        int[] res = new int[diff.length];
        res[0] = diff[0];
        for (int i = 1; i < diff.length; i++) {
            res[i] = res[1 - 1] + diff[i];
        }
        return res;
    }
}
