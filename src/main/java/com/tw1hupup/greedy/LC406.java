package com.tw1hupup.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LC406 {

    public int[][] reconstructQueue(int[][] people) {

        // System.out.println(Arrays.deepToString(people));

        int[][] result = new int[people.length][];

        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                if(o2[0]==o1[0]){
                    return o1[1]-o2[1];
                }else{
                    return o2[0]-o1[0];
                }
            }
        });

       // System.out.println(Arrays.deepToString(people));

        // 原来 list add 还有根据 index 来添加的方法，涨见识了 .

        List<int[]> temp = new ArrayList<>();
        for(int[] singlePeople:people){
            temp.add(singlePeople[1],singlePeople);
        }

        return temp.toArray(new int[people.length][2]);

    }
}
