/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.tw1hupup.zhongweishu;

import java.util.Arrays;

/**
 * @author guoan.hga
 * @version : Solution.java, v 0.1 2021年06月12日 3:17 下午 guoan.hga Exp $
 */
public class Solution {

    /**
     * 根据两个有序数组计算中位数-
     * 思路1 : 将两个数组合并成一个数组 ，然后根据奇偶算出中位数
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays(int[] nums1,int[] nums2){

        double result = 0d ;
        int s1Length = nums1.length;
        int s2Length = nums2.length;
        int mergeArrayLength = s1Length+s2Length;
        int[] mergeArray = new int[mergeArrayLength];
        for(int i=0;i<s1Length;i++){
            mergeArray[i] = nums1[i];
        }
        for(int i=0;i<s2Length;i++){
            mergeArray[s1Length+i] = nums2[i];
        }
        Arrays.sort(mergeArray);
        System.out.println(Arrays.toString(mergeArray));
        if(mergeArrayLength%2==0){
            int mid = mergeArrayLength/2 ;
            result = ( mergeArray[mid]+mergeArray[mid-1])/2.0;
        }else{
            result = mergeArray[mergeArrayLength/2];
        }
        return result;
    }
}