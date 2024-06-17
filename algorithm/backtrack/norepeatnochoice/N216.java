package algorithm.algorithm.backtrack.norepeatnochoice;

import java.util.ArrayList;
import java.util.List;
/**
 * @author xiehang
 * @date 2023/1/5 10:18
 * 组合总和 III
 * https://leetcode.cn/problems/combination-sum-iii/
 * 只使用数字1到9
 * 每个数字 最多使用一次
 * 找出所有相加之和为 n 的 k 个数的组合，且满足下列条件：
    输入: k = 3, n = 9
    输出: [[1,2,6], [1,3,5], [2,3,4]]
 *  子集/组合问题：元素无重无复选
 */
public class N216 {
//    List<T> result;
    //记录全集合
    public static List<List<Integer>> res=new ArrayList<>();
    //记录子集和
    public static List<Integer> list=new ArrayList<>();

    public static void main(String[] args) {
        //k 元素个数,相加之和为n
        int  k = 3, n = 9;
        combinationSum3(k,n);
    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
        backtrack(k,n,1,0);
        return res;
    }
    private static void backtrack(int k, int n, int start,int sum) {
        //    void backtrack(路径, 选择列表):
        //      if (满足结束条件){
        //      result.add(路径)
        //      return;
        //    }
        //k 元素个数,相加之和为n
        //元素个数>k或相加值>n，这些数据就无意义，剪枝剪掉
        if (list.size() > k || sum > n) {
            return;
        }
        if (sum == n && list.size() == k) {
            res.add(new ArrayList<>(list));
            return;
        }
//        for(选择：选择列表)
//        做选择;
//        backtrack(路径, 选择列表);
//        撤销选择;
        /**
         * 这里start控制树的生长，start=0时，递归使用i+1控制其中一棵树生长
         * start=1时，递归使用i+1控制第二棵树生长，以此类推
         * 递归从start开始，之前的数据就不会被遍历到
         */
        for (int i = start; i <=9 ; i++) {
            list.add(i);
            sum+=i;
            //每组集合元素不能重复，所以这里i+1
            backtrack(k,n,i+1,sum);
            // 撤销选择;
            sum-=i;
            list.remove(list.size()-1);
        }
    }
}