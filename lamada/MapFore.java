package algorithm.lamada;

import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author xiehang
 * @date 2024/6/27 20:19
 */
public class MapFore {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("C", 4);

        //1.遍历Map的键：
        map.keySet().forEach(key -> System.out.println(key));
        map.keySet().forEach(System.out::println);

        //2.遍历Map的值：
        map.values().forEach(value -> System.out.println(value));
        map.values().forEach(System.out::println);

        //3.遍历Map的键值对
        map.forEach((key, value) -> System.out.println(key + ":" + value));

        //4.使用Stream的方式遍历Map的键值对：
        map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));

        //5.map反转
        /**
         * Collectors.toMap()方法用于从流中构建一个新的Map
         * Map.Entry::getValue和Map.Entry::getKey是方法引用，分别表示取Map Entry的值和键
         */
        Map<Integer, String> map1 = map.entrySet().stream().collect(Collectors.toMap(
                Map.Entry::getValue, Map.Entry::getKey));
        System.out.println(map1);

    }
}
