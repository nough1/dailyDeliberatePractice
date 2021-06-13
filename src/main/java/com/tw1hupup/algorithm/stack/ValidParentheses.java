/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.tw1hupup.algorithm.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.logging.Handler;

/**
 * https://leetcode-cn.com/problems/valid-parentheses/
 * 20. 有效的括号
 * 遍历字符串
 * @author guoan.hga
 * @version : validParentheses.java, v 0.1 2021年06月12日 5:47 下午 guoan.hga Exp $
 */
public class ValidParentheses {

    public boolean isValid(String s) {


        boolean isValid = true ;

        Map<String,String> parents = new HashMap<>();
        parents.put("}","{");
        parents.put("]","[");
        parents.put(")","(");

        Stack stack = new Stack();
        int strLength = s.length();
        if(strLength==0){
            return isValid;
        }
        int currentIndex =0 ;
        while (currentIndex<strLength){

            String currentCharString = String.valueOf(s.charAt(currentIndex));
            if(stack.isEmpty()){
                stack.push(currentCharString);
            }else{

                if(parents.get(currentCharString)!=null && parents.get(currentCharString).equals(stack.peek())){
                    stack.pop();
                }else{
                    stack.push(currentCharString);
                }
            }
            currentIndex++;

        }
        return stack.isEmpty();

    }

}