package com.example.leetcode.easy;

/**
 * Created by Wilber
 * on 2017-12-16 .
 * Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle,
 * which means it moves back to the original place.
 * The move sequence is represented by a string. And each move is represent by a character.
 * The valid robot moves are R (Right), L (Left), U (Up) and D (down).
 * The output should be true or false representing whether the robot makes a circle.
 * <p>
 * Example 1:
 * Input: "UD"
 * Output: true
 * <p>
 * Example 2:
 * Input: "LL"
 * Output: false
 */

public class JudgeCircle {
    public boolean judgeCircle(String moves) {
        char[] flags = moves.toCharArray();
        int result = 0;
        for (int i = 0; i < flags.length; i++) {
            if (flags[i] == 'R') {
                result += 1;
            }
            if (flags[i] == 'L') {
                result -= 1;
            }
            if (flags[i] == 'U') {
                result += 1;
            }
            if (flags[i] == 'D') {
                result -= 1;
            }
        }
        return result == 0;
    }
}
