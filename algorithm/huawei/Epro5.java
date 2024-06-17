package algorithm.algorithm.huawei;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author xiehang
 * @date 2023/4/17 14:25
 * 单词语句倒序
 * the sky is blue
 * blue is sky the
 */
public class Epro5 {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String[] strs = s.trim().split("\\s+");
        List<String> list = Arrays.asList(strs);
        Collections.reverse(list);
        System.out.println(String.join(" ", list));
    }
}
