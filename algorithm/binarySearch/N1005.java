package algorithm.algorithm.binarySearch;

/**
 * @author xiehang
 * @create 2022-07-13 12:25
 * 面试题 10.05. 稀疏数组搜索
 * 稀疏数组搜索。有个排好序的字符串数组，其中散布着一些空字符串，编写一种方法，找出给定字符串的位置。
 */
public class N1005 {
    public static void main(String[] args) {
        String[] words = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
        String s = "ball";
        System.out.println(findString(words,s));
    }


        public static int findString(String[] words, String s) {
            for (int i = 0; i < words.length; i++) {
                if (s.equals(words[i])){
                    return i;
                }
            }
            return -1;
        }
}
