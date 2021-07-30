package com.tw1hupup.lc739;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class LC739 {


    public int[] dailyTemperatures(int[] temperatures){

        int[] result = new int[temperatures.length];

        for(int i=0;i<temperatures.length;i++){

            result[i] = 0;
            for(int j=i+1;j<temperatures.length;j++){
                if(temperatures[j]>temperatures[i]){
                    result[i] = j-i;
                    break;
                }
            }
        }

        return result;
    }

    public int[] dailyTemperaturesByMonotonicStack(int[] temperatures){

        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<temperatures.length;i++){

            while (!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){

                int index = stack.pop();
                result[index] = i-index;
            }
            stack.push(i);
        }
        return result;
    }

}
