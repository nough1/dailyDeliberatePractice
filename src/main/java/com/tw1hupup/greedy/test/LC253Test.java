package com.tw1hupup.greedy.test;

import com.tw1hupup.greedy.LC253;

public class LC253Test {

    public static void main(String[] args) {


        LC253 lc253 = new LC253();

        int[][] intervals = new int[][]{{0,30},{5,10},{15,20}};
        System.out.println(lc253.minMeetingRooms(intervals));

    }
}
