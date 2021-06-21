/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.tw1hupup.dfs.lc17;

import java.util.*;

/**
 * 电话号码的字母组合
 * @author guoan.hga
 * @version : LC17.java, v 0.1 2021年06月19日 7:43 下午 guoan.hga Exp $
 */
public class LC17 {

    public List<String> letterCombinations(String digits){

        // 队列解法

        LinkedList<String> letterCombinationList = new LinkedList<>();
        Map<Integer,String[]> digitLetterMap = new HashMap<>();
        digitLetterMap.put(2,new String[]{"a","b","c"});
        digitLetterMap.put(3,new String[]{"d","e","f"});
        digitLetterMap.put(4,new String[]{"g","h","i"});
        digitLetterMap.put(5,new String[]{"j","k","l"});
        digitLetterMap.put(6,new String[]{"m","n","o"});
        digitLetterMap.put(7,new String[]{"p","q","r","s"});
        digitLetterMap.put(8,new String[]{"t","u","v"});
        digitLetterMap.put(9,new String[]{"w","x","y","z"});

        int digitNum =  digits.length();
        if(digitNum==0){
            return letterCombinationList;
        }

        letterCombinationList.add("");
        for(int i=0;i<digitNum;i++){

            int digit = Character.getNumericValue(digits.charAt(i));
            while (letterCombinationList.peek().length()==i){
                String t = letterCombinationList.remove();
                for(String charValue:digitLetterMap.get(digit)){
                    letterCombinationList.add(t+charValue);
                }
            }

        }


        return letterCombinationList;

    }

}