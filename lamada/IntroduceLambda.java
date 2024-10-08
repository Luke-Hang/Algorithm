package algorithm.lamada;

import java.util.Arrays;
import java.util.List;

/**
 * @author xiehang
 * @date 2024/6/27 12:01
 */
public class IntroduceLambda {
    public static void main(String[] args) {

    /*    () -> System.out.println("沉默王二")
    来从左到右解释一下，() 为 Lambda 表达式的参数列表（本例中没有参数），-> 标识这串代码为 Lambda 表达式
    （也就是说，看到 -> 就知道这是 Lambda），System.out.println("沉默王二") 为要执行的代码，即将“沉默王二”打印到标准输出流。*/

    /**
     * Lambda 语法
     * 每个 Lambda 表达式都遵循以下法则：
     * (parameters) -> expression
     * 或
     * (parameters) ->{ statements; }
     *
     */

//        newThread1();
//        newThread2();
        newThread3();
        newThread4();

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        // 使用 Lambda 表达式遍历列表
        names.forEach(name -> System.out.println(name));
        System.out.println("=========================");
        names.forEach(System.out::println);
    }

    /**
     * 原来我们创建一个线程并启动它是这样的：
     */
    private static void newThread1() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("沉默王二");
            }
        }).start();
    }
    private static void newThread2() {
        new Thread(()-> System.out.println("沉默王二")).start();
    }

    //传统的匿名内部类
    private static void newThread3() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        };
    }

    //使用 Lambda 表达式
    private static void newThread4() {
        Runnable runnable=()-> System.out.println("Hello World!");
    }
}
