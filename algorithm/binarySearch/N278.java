package algorithm.algorithm.binarySearch;

/**
 * @author xiehang
 * @create 2022-07-17 16:00
 * 278. 第一个错误的版本
 * isBadVersion(version)返回true，表示此版本是错误版本
 * isBadVersion(version)返回false,表示此版本是正确的版本
 * https://leetcode.cn/problems/first-bad-version/
 */
public class N278 {
    public static void main(String[] args) {
        int n = 5, bad = 4;
        System.out.println(firstBadVersion(n));
    }

    /**
     * 版本顺序只能是：false,false,false,false,true,true,true,true
     * true只能出现在左边，所以第一次错误只需要想做缩进寻找即可
     */
    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            //isBadVersion(version)返回true，表示此版本是错误版本,继续向左搜索
            if (isBadVersion(mid)) {
                right = mid - 1;
            } else {
                //此时isBadVersion(version)返回false，表示此版本是正确的版本，继续向右搜索
                left = mid + 1;
            }
        }
        //题目要求当n = 1, bad = 1。输出1。所以此处return left
        return left;
    }
    //你可以通过调用 bool isBadVersion(version) 接口来判断版本号 version 是否在单元测试中出错
    //此处是为了不让代码报错，此处代码无意义
    private static boolean isBadVersion(int mid) {
        return false;
    }
}
