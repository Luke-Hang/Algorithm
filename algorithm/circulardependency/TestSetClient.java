package algorithm.algorithm.circulardependency;

/**
 * @author xiehang
 * @date 2023/3/14 14:48
 */
public class TestSetClient {
    public static void main(String[] args) {
        ServiceAA aa=new ServiceAA();
        ServiceBB bb=new ServiceBB();

        aa.setServiceBB(bb);
        bb.setServiceAA(aa);
    }

}
