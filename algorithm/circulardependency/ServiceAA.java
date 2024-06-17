package algorithm.algorithm.circulardependency;

/**
 * @author xiehang
 * @date 2023/3/14 14:45
 */
public class ServiceAA {
    private ServiceBB serviceBB;

    public void setServiceBB(ServiceBB serviceBB) {
        System.out.println("AA里面设置了BB");
        this.serviceBB = serviceBB;
    }
}
