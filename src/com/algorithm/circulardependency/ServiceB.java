package com.algorithm.circulardependency;

/**
 * @author xiehang
 * @date 2023/3/14 14:32
 */
public class ServiceB {
    private ServiceA serviceA;

    public ServiceB(ServiceA serviceA) {
        this.serviceA = serviceA;
    }
}
