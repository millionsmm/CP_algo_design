package com.example.proxy.dynamic_proxy;

import com.example.proxy.static_proxy.Customer;
import com.example.proxy.static_proxy.IBuyCar;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Wilber
 * on 18/10/2017.
 */

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        InvocationHandler invocationHandler = new DynamicProxy(customer);
        IBuyCar buyCar = (IBuyCar)
                Proxy.newProxyInstance(
                        invocationHandler.getClass().getClassLoader(),
                        customer.getClass().getInterfaces(),
                        invocationHandler);
        buyCar.buyCard();
    }
}
