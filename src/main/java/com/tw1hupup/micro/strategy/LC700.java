/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.tw1hupup.micro.strategy;

import com.tw1hupup.bfs.lc101.TreeNode;

/**
 * @author guoan.hga
 * @version : LC700.java, v 0.1 2021年12月12日 5:05 下午 guoan.hga Exp $
 */
public class LC700 {

    /**
     * 二叉树搜索
     * @param root
     * @param val
     * @return
     */
    public TreeNode searchBST(TreeNode root,int val){

        if(root==null){
            return null ;
        }
        if(root.val==val){
            return root;
        }else if(val>root.val){
            return searchBST(root.right,val);
        }else{
            return searchBST(root.left,val);
        }

    }
}