package algorithm.algorithm.string;

import java.util.*;

/**
 * @author xiehang
 * @date 2023/1/30 10:41
 * https://leetcode.cn/problems/group-anagrams/
 * 字母异位词分组
 */
public class N49 {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }

    /**
     * 解法一
     */
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            //将字符串转为数组，然后排序
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            //将遍历到的字符串转换为对应的key，没有此key,存入，并将value设为list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            //有此key，将原始值加入此key对应的list中
            map.get(key).add(str);
        }
        //map.values()拿到map中的所有value值
        return new ArrayList<>(map.values());
    }

    /**
     * 解法二
     * Map.getOrDefault(Object key, V defaultValue)方法的作用是：
     * 当Map集合中有这个key时，就使用这个key值,得到对应的value；
     * 如果没有就使用默认值defaultValue,也就是第二个参数
     * map.getOrDefault(key,new ArrayList<>());
     */
    public static List<List<String>> groupAnagrams2(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            //如果map中没有key，则新建list，如果有key则将原始值加入此key对应的list中
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }

    /**
     * 解法三
     */
    public static List<List<String>> groupAnagrams3(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] counts = new int[26];
            int length = str.length();
            for (int i = 0; i < length; i++) {
                //给counts数组赋值，将排在a字母后面的字母以ASCII码差值，存入counts数组中
                counts[str.charAt(i) - 'a']++;
            }
            // 将每个出现次数大于 0 的字母和出现次数按顺序拼接成字符串，作为哈希表的键
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (counts[i] != 0) {
                    sb.append((char) ('a' + i));
                    sb.append(counts[i]);
                }
            }
            String key = sb.toString();
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }
}
