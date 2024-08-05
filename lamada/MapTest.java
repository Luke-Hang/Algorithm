package algorithm.lamada;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author xiehang
 * @date 2024/6/27 17:19
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

//        forEach(map);
//        replaceAll(map);
//        update(map);

//        reversedMap();
//        listToMap1();
        listToMap2();
    }



    //forEach()方法
    private static void forEach(Map<String, Integer> map) {
        map.put("Alice", 90);
        map.put("Bob", 80);
        map.put("Charlie", 95);
//      map.forEach((k, v) -> System.out.println(k + ": " + v));
        map.forEach((name, score) -> System.out.println(name + ":" + score));
    }

    //replaceAll()方法,使用Lambda表达式替换Map中的所有值。
    private static void replaceAll(Map<String, Integer> map) {
        map.put("Alice", 90);
        map.put("Bob", 80);
        map.put("Charlie", 95);
//        map.forEach((k, v) -> expression);
        map.replaceAll((name, score) -> score + 5);
        map.forEach((name, score) -> System.out.println(name + "=" + score));
        System.out.println(map);
    }

    //putIfAbsent()方法,使用Lambda表达式在Map中插入键值对，仅当键不存在时才插入
    private static void update(Map<String, Integer> map) {
        map.put("Alice", 90);
        map.put("Bob", 80);
        map.putIfAbsent("Charlie", 95);
        map.putIfAbsent("Alice", 100);
        System.out.println(map);
    }

    private static void reversedMap() {
        Map<String, String> map = new HashMap<>();
        map.put("beijing", "北京");
        map.put("tianjin", "天津");
        map.put("xi’an", "西安");
        map.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getValue,Map.Entry::getKey,// 新的键，原来的值,// 新的值，原来的键
                        (oldValue, newValue) -> oldValue));
        System.out.println(map);
    }

    private static void listToMap1() {
        List<String> list = new ArrayList<>();
        list.add("Mohan");
        list.add("Sohan");
        list.add("Mahesh");

        //Collectors.toMap(k, value)
        Map<String, Integer> map = list.stream().collect(Collectors.toMap(s -> s, s -> s.length()));
        System.out.println(map);
        map.forEach((k, v) -> System.out.println("Key: " + k + ", value: " + v));
    }

    private static void listToMap2(){
        List<Person> list = new ArrayList<>();
        list.add(new Person(100, "Mohan"));
        list.add(new Person(200, "Sohan"));
        list.add(new Person(300, "Mahesh"));
        //Collectors.toMap(k, value)
        Map<Integer, String> map = list.stream().collect(Collectors.toMap(Person::getId, Person::getName));
        map.forEach((k, v) -> System.out.println(k + ":" + v));
//        map.forEach((k, v) -> System.out.println("Key: " + k + ", value: " + v));
//        System.out.println(map);
    }
}
