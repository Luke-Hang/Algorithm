package com.algorithm.collectionUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @author xiehang
 * @date 2023/2/13 17:54
 */
public class ListUtils {
    public static void main(String[] args) {

        /* List集合，元素有序，可重复 */
        List<Integer> list = new ArrayList<>();
        System.out.println(list.add(1));
        System.out.println(list.add(1));

        List<Integer> linkedList = new LinkedList<>();
        System.out.println(linkedList.add(1));
        System.out.println(linkedList.add(1));

        List<Integer> vector = new Vector<Integer>();
        System.out.println(vector.add(1));
        System.out.println(vector.add(1));
    }
}
