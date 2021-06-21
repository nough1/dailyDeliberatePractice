/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.tw1hupup.dfs.lc98;

import com.tw1hupup.bfs.lc101.TreeNode;

import java.util.Stack;

/**
 * 递归版写法
 * https://leetcode-cn.com/problems/validate-binary-search-tree/
 * 思路 : 应该可以用递归来解决 . 那递归的函数怎么定义 , 递归的终止条件是什么呢 ？
 * @author guoan.hga
 * @version : LC98.java, v 0.1 2021年06月20日 10:42 上午 guoan.hga Exp $
 */
public class LC98_RECURSIVE {

    // 中序遍历写法

    public boolean isValidBST(TreeNode root){

       if(root==null){
           return true ;
       }

       Stack<TreeNode> stack = new Stack<>();
       TreeNode pre = null ;
       while(root!=null || !stack.isEmpty()){

           // 最左边压栈

           while (root!=null){

               stack.push(root);
               root = root.left;

           }

           root = stack.pop();

           // 为什么用 pre 
            if(pre!=null && root.val<=pre.val){
                return false;
            }
            pre = root ;
            root = root.right;

       }

       return true;

    }
}