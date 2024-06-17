package algorithm.algorithm.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author xiehang
 * @create 2022-12-13 14:49
 */
public class Test {
    public static int leastIntarval(char[] tasks, int n) {

        int[] data = new int[26];
        for (char c : tasks) {
            data[c - 'A']++;

        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(26, Collections.reverseOrder());
        for (Integer i : data) {
            if (i > 0) {
                queue.add(i);
            }
        }
        int time = 0;
        while (!queue.isEmpty()) {
            int i = 0;
            List<Integer> executedList = new ArrayList<>();
            while (i <= n) {

                if (!queue.isEmpty()) {
                    int num = queue.poll();
                    if (num > 1) {
                        executedList.add(num - 1);
                    }
                }
                time++;
                if (queue.isEmpty() && executedList.size() == 0) {
                    break;
                }

                i++;

            }
            for (Integer e : executedList) {
                queue.add(e);
            }
        }

        return time;

    }
}
