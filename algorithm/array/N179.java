package algorithm.algorithm.array;

import java.util.Arrays;

/**
 * @author xiehang
 * @date 2023/1/31 15:32
 * https://leetcode.cn/problems/largest-number/
 */
public class N179 {
    public static void main(String[] args) {
        int[] nums = {10, 2};
//        int[] nums ={01,0};
        System.out.println(largestNumber(nums));
    }

    public static String largestNumber(int[] nums) {
        //将nums数组转换为String数组
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        // 自定义规则排序:String类型的[a,b]=["10","2"],a+b=102,b+a=210
        //(a + b).compareTo(b + a)返回参与比较的前后两个字符串的asc码的差值，如果两个字符串首字母不同，则该方法返回首字母的asc码的差值
        /**
         * Java字典序排序  String[] 字符串数组
         * 正序排序
         *      public String[] sortA(String[] strings){
         *         Arrays.sort(strings, (o1,o2) -> (o1 + o2).compareTo((o2 + o1)));
         *         return strings;
         *     }
         * 逆序排序
         *      public String[] sortA(String[] strings){
         *         Arrays.sort(strings, (o1,o2) -> (o2 + o1).compareTo((o1 + o2)));
         *         return strings;
         *     }
         * String 字符串
         *  public String SortB(String str, int n){
         *         char[] chars = str.toCharArray();
         *         Arrays.sort(chars);
         *         String s = new String(chars);
         *         return s;
         *   }
         */
        Arrays.sort(strs, (a, b) -> (b + a).compareTo(a + b));
        //当数组是一个或多个0的时候，直接返回一个0
        if (strs[0].charAt(0)=='0'){
            return "0";
        }
        String join = String.join("", strs);
        return join;
    }
}
