package com.algorithm.huawei;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author xiehang
 * @create 2022-04-25 16:34
 * HJ8 合并表记录
 */
public class HJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //TreeMap:能够把它保存的记录根据key排序,默认key是按升序排序
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            int value = sc.nextInt();
            //map.getOrDefault,当k在map中能找到，则返回其对应的value值，
            // 如果没找到，则返回默认值，此处当key能找到，返回对应value值，找不到返回默认值0
//            map.put(key, map.getOrDefault(key, 0) + value);
            //或者
            if (map.containsKey(key)){
                map.put(key, map.get(key)+value);
            }else {
                map.put(key, value);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
