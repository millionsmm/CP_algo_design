package com.example.newcoder;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Wilber
 * on 2017-12-03 .
 * 一些项目要占用一个会议室宣讲，会议室不能同时容纳两个项目的宣讲。
 * 给你每一个项目开始的时间和结束的时间，你来安排宣讲的日程，要求
 * 会议室进行的宣讲的场次最多。返回这个最多的宣讲场次。
 */

public class BestArrange {
    public int bestArrange(Program[] programs, int start) {
        Arrays.sort(programs, new ProgramComparator());
        int result = 0;
        for (int i = 0; i < programs.length; i++) {
            if (start <= programs[i].start) {
                result++;
                start = programs[i].end;
            }
        }
        return result;
    }

    class Program {
        int start;
        int end;

        Program(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    private class ProgramComparator implements Comparator<Program> {

        @Override
        public int compare(Program o1, Program o2) {
            return o1.end - o2.end;
        }
    }
}
