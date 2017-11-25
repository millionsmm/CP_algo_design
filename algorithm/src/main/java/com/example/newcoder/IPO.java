package com.example.newcoder;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by Wilber
 * on 2017-11-25 .
 * input:
 * 参数1，正数数组costs
 * 参数2，正数数组profits
 * 参数3，正数k
 * 参数4，正数m
 * <p>
 * costs[i]表示i号项目的花费
 * profits[i]表示i号项目在扣除花费之后还能挣到的钱（利润）
 * k表示你不能并行，只能串行的最多做k个项目
 * m表示你初始的资金
 * <p>
 * 说明：你每做完一个项目，马上获得的收益，可以支持你去做下一个项目。
 * <p>
 * output:
 * 你最后获得的最大钱数。
 */

public class IPO {
    private int findMaximizedCapital(int k, int m, int[] profits, int[] costs) {
        Node[] nodes = new Node[profits.length];
        for (int i = 0; i < profits.length; i++) {
            nodes[i] = new Node(profits[i], costs[i]);
        }
        PriorityQueue<Node> minCostQ = new PriorityQueue<>(new MinCostComparator());
        PriorityQueue<Node> maxProfitQ = new PriorityQueue<>(new MaxProfitComparator());
        for (int i = 0; i < nodes.length; i++) {
            minCostQ.add(nodes[i]);
        }
        for (int i = 0; i < k; i++) {
            while (!minCostQ.isEmpty() && minCostQ.peek().c <= m) {
                maxProfitQ.add(minCostQ.poll());
            }
            if (maxProfitQ.isEmpty()) {
                return m;
            }
            m += maxProfitQ.poll().p;
        }
        return m;
    }

    private class Node {
        private int p;
        private int c;

        Node(int p, int c) {
            this.p = p;
            this.c = c;
        }
    }

    private class MinCostComparator implements Comparator<Node> {
        @Override
        public int compare(Node o1, Node o2) {
            return o1.c - o2.c;
        }
    }

    private class MaxProfitComparator implements Comparator<Node> {
        @Override
        public int compare(Node o1, Node o2) {
            return o2.p - o1.p;
        }
    }
}
