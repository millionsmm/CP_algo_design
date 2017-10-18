package com.example.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Wilber
 * on 18/10/2017.
 * 动态代理
 */

public class DynamicProxy implements InvocationHandler {
    Object object;//被代理类的实例

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object result = method.invoke(this.object, objects);
        return result;
    }
}
