package algorithm.algorithm.test;

/**
 * @author xiehang
 * @date 2023/4/16 15:35
 */
public class PassO {
    public static void main(String[] args) {
        PassO p = new PassO();
        p.start();
    }

    void start() {
        Two t = new Two();
        System.out.print(t.x + " ");//null

        Two t2 = fix(t);
        //tt.x = 42;
        System.out.print(t.x + " " + t2.x);
    }

    Two fix(Two tt) {
        tt.x = 42;
        return tt;
    }
}
