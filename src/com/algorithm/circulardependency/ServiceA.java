package com.algorithm.circulardependency;

/**
 * @author xiehang
 * @date 2023/3/14 14:32
 */
public class ServiceA {

    private ServiceB serviceB;

    public ServiceA(ServiceB serviceB) {
        this.serviceB = serviceB;
    }
}
