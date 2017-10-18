package com.example.proxy.static_proxy;

/**
 * Created by Wilber
 * on 18/10/2017.
 */

public class BuyCarProxy implements IBuyCar {
    private Customer customer;

    public BuyCarProxy(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void buyCard() {
        int cash = customer.getCash();
        if (cash < 100000) {
            System.out.println("不够钱买");
            return;
        }
        customer.buyCard();
    }
}
