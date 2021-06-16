package com.tw1hupup.greedy.test;

import com.tw1hupup.greedy.LC406;

import java.util.Arrays;

public class LC406Test {

    public static void main(String[] args) {

        LC406 lc406 = new LC406();

        int[][] people = new int[][]{{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        int[][] result = lc406.reconstructQueue(people);
        System.out.println(Arrays.deepToString(result));
    }
}
