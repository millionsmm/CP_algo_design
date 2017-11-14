package com.example.twenty_seventeen.qunar;

import java.util.Scanner;

/**
 * 去哪儿
 * Created by Wilber
 * on 11/10/2017.
 * 最少转机：
 * 去哪儿网将机票业务扩展到了大魏国，宇文玥和楚乔都是去哪儿网的忠实用户，经
 * 常坐飞机双宿双飞，现在已知大魏国有n个城市，共有m条国内航线，航线都是可往返的，
 * 已知他们所居住的城市和他们想要达到的城市，请给出最小转机次数。如果两城市间不可到达，
 * 则返回DISCONNECTED
 *
 * @ 输入
 * 第一行两个数n，m(2≤n≤100，1≤m≤100); 紧随其后的是两个城市的名称，代表居住城市和想要到达的城市
 * 接下来m行，分别为各个航线间的两个城市（城市名称间以空格隔开）
 * @ 输出
 * 最少的转机数
 */

public class LessAirplane {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String liveCity = in.next();
        String purposeCity = in.next();
        String[] city = new String[m];
        for (int i = 0; i < m; i++) {
            city[i] = in.nextLine();
        }
        System.out.println();
    }


}
