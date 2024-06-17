package algorithm.algorithm.circulardependency;

/**
 * @author xiehang
 * @date 2023/3/14 15:13
 */
public class B {
    private A a;

    public B() {
        System.out.println("---B created success");
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }
}
