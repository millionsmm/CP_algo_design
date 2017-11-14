package com.example.twenty_seventeen.bytedance;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 今日头条
 * Created by Wilber
 * on 17/10/2017.
 * 推箱子
 */

public class today1 {
    private static int n, m, sx, sy, ex, ey, px, py;
    private static char mp[][] = new char[50][50];
    private static char mark[][] = new char[n][m];
    private static int dx[] = {0, 1, 0, -1};
    private static int dy[] = {1, 0, -1, 0};
    private static boolean used[][][] = new boolean[4][50][50];

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; i++) {
                mark[i][j] = in.next().charAt(0);
                if (mark[i][j] == 'E') {
                    ex = i;
                    ey = j;
                }
                if (mark[i][j] == 'S') {
                    px = i;
                    py = j;
                }
                if (mark[i][j] == '0') {
                    sx = i;
                    sy = j;
                }
            }
        }
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                mp[i][j] = '#';
            }
        }
        System.out.print(bfs());
    }


    private static void move(int x1, int y1, int x2, int y2) {
        Node a = new Node();
        a.x1 = x1;
        a.y1 = y1;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(a);
        mark[x1][y1] = '#';
        while (!queue.isEmpty()) {
            Node q = queue.peek();
            queue.poll();
            for (int i = 0; i < 4; i++) {
                Node t = new Node();
                t.x1 = q.x1 + dx[i];
                t.y1 = q.y1 + dy[i];
                if (mp[t.x1][t.y1] == '#' || (t.x1 == x2) && t.y1 == y2) continue;
                if (mark[t.x1][t.y1] == '.') continue;
                mark[t.x1][t.y1] = '#';
                queue.offer(t);
            }
        }
    }

    private static int bfs() {
        Queue<Node> queue = new LinkedList<>();
        Node a = new Node();
        a.x1 = sx;
        a.y1 = sy;
        a.x2 = px;
        a.y2 = py;
        a.t = 0;
        queue.offer(a);
        while (!queue.isEmpty()) {
            Node b = queue.poll();
            if (b.x1 == ex && b.y1 == ey) {
                return b.t;
            }
            move(b.x2, b.y2, b.x1, b.y1);
            for (int i = 0; i < 4; i++) {
                a.x2 = b.x1;
                a.y2 = b.y1;
                a.x1 = b.x1 + dx[i];
                a.y1 = b.y1 + dy[i];
                a.t = b.t + 1;
                if (mp[a.x1][a.y1] == '#') continue;
                if (!used[i][a.x1][a.y1]) continue;
                if (mark[b.x1 - dx[i]][b.y1 - dy[i]] != '.') continue;
                used[i][a.x1][a.y1] = true;
                queue.offer(a);
            }
        }
        return -1;
    }

    private static class Node {
        int x1, y1, x2, y2, t;
    }


}
