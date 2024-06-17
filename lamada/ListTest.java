package algorithm.lamada;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


/**
 * @author xiehang
 * @date 2024/6/6 23:32
 */
public class ListTest {
    public static void main(String[] args) {
        List dishList=new ArrayList<>();
        beforeJava7(dishList);
        afterJava8(dishList);


    }

    /**
     * 对数据库查询到的菜肴进行一个处理：
     * 筛选出卡路里小于 400 的菜肴
     * 对筛选出的菜肴进行一个排序
     * 获取排序后菜肴的名字
     * @param dishList
     * @return
     */
    private static List<String> beforeJava7(List<Dish> dishList) {
        List<Dish> lowCaloricDishes = new ArrayList<>();

        //1.筛选出卡路里小于400的菜肴
        for (Dish dish : dishList) {
            if (dish.getCalories() < 400) {
                lowCaloricDishes.add(dish);
            }
        }

        //2.对筛选出的菜肴进行排序
        Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return Integer.compare(o1.getCalories(), o2.getCalories());
            }
        });

        //3.获取排序后菜肴的名字
        List<String> lowCaloricDishesName = new ArrayList<>();
        for (Dish d : lowCaloricDishes) {
            lowCaloricDishesName.add(d.getName());
        }

        return lowCaloricDishesName;
    }
    private static List<String> afterJava8(List<Dish> dishList) {
        return dishList.stream().
                        filter(dish -> dish.getCalories()<400)//筛选出卡路里小于400的菜肴
                        .sorted(Comparator.comparing(Dish::getCalories))//根据卡路里进行排序
                        .map(Dish::getName) //提取菜肴名称
                        .collect(Collectors.toList());//转换为List
    }

    private static void afterJava9(List<Dish> dishList) {
        List<Dish> collect = dishList.stream().filter(dish -> dish.getCalories() > 400).collect(Collectors.toList());
    }
}
