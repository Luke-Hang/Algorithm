package algorithm.algorithm.circulardependency;

/**
 * @author xiehang
 * @date 2023/3/14 14:45
 */
public class ServiceBB {
    private ServiceAA serviceAA;

    public void setServiceAA(ServiceAA serviceAA) {
        System.out.println("BB里面设置了AA");
        this.serviceAA = serviceAA;
    }
}
