package algorithm.algorithm.circulardependency;

/**
 * @author xiehang
 * @date 2023/3/14 14:33
 */
public class TestConstruction {
    public static void main(String[] args) {
        //构造方法注入,会出现一个无法解决的循环依赖问题，如下代码所示
        //new ServiceA(new ServiceB(new ServiceA(new ServiceB())));
    }
}
