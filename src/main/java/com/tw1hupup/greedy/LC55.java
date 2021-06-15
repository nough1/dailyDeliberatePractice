/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.tw1hupup.greedy;

/**
 * 判断是否可以跳跃到元素的最后一个位置 .
 * // 分析下来有点像回溯试探的感觉，这种代码不知道怎么写
 * @author guoan.hga
 * @version : LC55.java, v 0.1 2021年06月13日 3:29 下午 guoan.hga Exp $
 */
public class LC55 {

    public boolean canJump(int[] nums){

        int lastPosition = nums.length-1;

        // 从当前位置可以跳跃到的最大位置

        int maxJumpPosition = nums.length-1 ;

        for(int i=lastPosition-1;i>=0;i--){

            if(nums[i]+i>=maxJumpPosition){
                maxJumpPosition = i ;
            }

        }
        return  maxJumpPosition==0?true:false;

    }
}