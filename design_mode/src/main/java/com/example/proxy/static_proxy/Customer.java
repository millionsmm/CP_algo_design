package com.example.proxy.static_proxy;

/**
 * Created by Wilber
 * on 18/10/2017.
 */

public class Customer implements IBuyCar {
    private int cash;

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    @Override
    public void buyCard() {
        System.out.println("买一辆车花费了：" + cash + "元");
    }
}
