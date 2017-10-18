package com.example.proxy.static_proxy;

/**
 * Created by Wilber
 * on 18/10/2017.
 */

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCash(200000);
        BuyCarProxy buyCarProxy = new BuyCarProxy(customer);
        buyCarProxy.buyCard();

        BuyCarProxy buyCarProxy1 = new BuyCarProxy(customer);
        customer.setCash(90000);
        buyCarProxy1.buyCard();
    }
}
