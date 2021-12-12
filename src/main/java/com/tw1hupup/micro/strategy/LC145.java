/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.tw1hupup.micro.strategy;

import com.tw1hupup.bfs.lc101.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guoan.hga
 * @version : LC145.java, v 0.1 2021年12月12日 5:13 下午 guoan.hga Exp $
 */
public class LC145 {

    /**
     * 后续遍历
     * 第一次提交失败 : 原因是对局部变量的问题 .
     * todo 还差一个非递归实现 .
     * @param root
     * @return
     */
    public List<Integer> postOrderTraversal(TreeNode root){

        List<Integer> result = new ArrayList<>();
        postOrderTraversal(root,result);
        return result;
    }

    public void postOrderTraversal(TreeNode root,List<Integer> visitList){

        if(root==null){
            return  ;
        }
        postOrderTraversal(root.left,visitList);
        postOrderTraversal(root.right,visitList);
        visitList.add(root.val);

    }
}