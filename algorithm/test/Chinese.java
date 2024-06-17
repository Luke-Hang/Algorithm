package algorithm.algorithm.test;

/**
 * @author xiehang
 * @date 2023/4/16 14:52
 */
public class Chinese {

    private static Chinese objref = new Chinese();

    private Chinese() {
    }

    public static Chinese getInstance() {
        return objref;
    }
}
