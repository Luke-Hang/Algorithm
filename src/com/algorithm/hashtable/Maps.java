package com.algorithm.hashtable;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author xiehang
 * @date 2023/4/13 22:05
 */
public class Maps {
    public static void main(String[] args) {
//        Map<String,String> hashMap=new HashMap<>();
//        hashMap.put(null,null);
//
//        Map<String,String> linkedHashMap=new LinkedHashMap<>();
//        linkedHashMap.put(null,null);
//
//        Map<String,String> treeMap=new TreeMap<>();
//        treeMap.put(null,null);
//
//        Hashtable hashtable=new Hashtable<>();
//        hashtable.put(null,null);


        HashMap<Integer, Student> map = new HashMap<>();
        map.put(1003, new Student(1003, "Sam"));
        map.put(1005, new Student(1005, "Joseph"));
        map.put(1001, new Student(1001, "Kate"));
        map.put(1002, new Student(1002, "Miranda"));
        map.put(1004, new Student(1004, "Peter"));

//        TreeMap<Integer, Student> sortedMap = new TreeMap<>(map);
//        System.out.println(sortedMap);


        //使用lamda表达式进行排序
/*        Map<Integer, Student> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors
                        .toMap(Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new));
        System.out.println(sortedMap);*/

/*        TreeMap<String,String> treeMap = new TreeMap<>();
        treeMap.put("jack","good");
        treeMap.put("bob","nice");
        System.out.println(treeMap.toString());*/

        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(88,"good");
        treeMap.put(12,"nice");
        treeMap.put(66,"aaa");
        System.out.println(treeMap);
    }
}
