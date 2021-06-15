package com.tw1hupup.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LC253 {

    /**
     * java 二维数组怎么排序
     * @param intervals
     * @return
     */
    public int minMeetingRooms(int[][] intervals) {

        int minMeetingRoomNum = 0 ;

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        minHeap.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=minHeap.peek()[1]){
                minHeap.poll();
            }
            minHeap.add(intervals[i]);
        }
        return minHeap.size();

    }
}
