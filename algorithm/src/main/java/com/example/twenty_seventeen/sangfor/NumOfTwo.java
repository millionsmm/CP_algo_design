package com.example.twenty_seventeen.sangfor;

import java.util.Scanner;

/**
 * 深信服
 * Created by Wilber
 * on 2017/10/13.
 * /*
 * 一个正整数可以表示为多个正整数相加的表达式，表达式中的各个正整数要求都是2的幂。例如给定正整数7，它有下列六个符合要求的表达式：
 * 1)1+1+1+1+1+1+1
 * 2)1+1+1+1+1+2
 * 3)1+1+1+2+2
 * 4)1+1+1+4
 * 5)1+2+2+2
 * 6)1+2+4
 * 因此，正整数7符合条件的表达式个数是6. 编写一个程序，对于给定的正整数N(1 <= N <= 1,000)，输出符合条件的表达式个数。要求：时间复杂度不高于O(N)。
 */

public class NumOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int dp[]=new int[n+1];
        for (int i=0;i<=n;i++){
            dp[i]=1;
        }
        int k=2;
        while(k<=n){
            for (int j=k;j<=n;j++){
                dp[j]+=dp[j-k];
            }
            k=k*2;
        }
        System.out.print(dp[n]);
    }
}
