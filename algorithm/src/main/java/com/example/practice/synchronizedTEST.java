package com.example.practice;

/**
 * Created by Wilber
 * on 18/10/2017.
 */

public class synchronizedTEST {


    public static void main(String[] args) {
        ThreadA threadA = new ThreadA("ThreadA");
        synchronized (threadA) {
            try {
                System.out.println(Thread.currentThread().getName() + " start t1");
                threadA.start();
                System.out.println(Thread.currentThread().getName() + " wait()");
                threadA.wait();
                System.out.println(Thread.currentThread().getName() + " continue");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
