package algorithm.algorithm.collectionUtils;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author xiehang
 * @date 2023/2/13 17:40
 */
public class SetUtils {
    public static void main(String[] args) {
       SetTest();
    }

    /* Set集合，元素无序，不可重复 */

    private static void SetTest() {
/*        Set<Integer> hashSet = new HashSet<>();
        System.out.println(hashSet.add(1));//hashSet中没有该数据1，数据成功加入，返回true
        System.out.println(hashSet.add(1));//hashSet中有该数据1，数据不再加入，返回false
        System.out.println(hashSet.add(2));//hashSet中没有该数据2，数据成功加入，返回true*/

/*        Set<Integer> linkedHashSet=new LinkedHashSet<>();
        System.out.println(linkedHashSet.add(1));//linkedHashSet中没有该数据1，数据成功加入，返回true
        System.out.println(linkedHashSet.add(1));//linkedHashSet中有该数据1，数据不再加入，返回false
        System.out.println(linkedHashSet.add(2));//linkedHashSet中有该数据2，数据成功加入，返回true*/

        Set<Integer> treeSet=new TreeSet<Integer>();
        System.out.println(treeSet.add(1));//treeSet中没有该数据1，数据成功加入，返回true
        System.out.println(treeSet.add(1));//treeSet中有该数据1，数据不再加入，返回false
        System.out.println(treeSet.add(2));//treeSet中没有该数据2，数据成功过加入，返回true

    }
}
