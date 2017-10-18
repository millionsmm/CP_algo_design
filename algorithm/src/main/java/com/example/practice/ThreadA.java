package com.example.practice;

/**
 * Created by Wilber
 * on 18/10/2017.
 */

public class ThreadA extends Thread {
    public ThreadA(String name) {
        super(name);
    }

    @Override
    public void run() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " call notify()");
            notify();
        }
    }
}
