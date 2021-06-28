/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.tw1hupup.dfs.lc94;

import com.tw1hupup.bfs.lc101.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 * 二叉树的中序遍历问题
 * @author guoan.hga
 * @version : LC94.java, v 0.1 2021年06月27日 10:52 上午 guoan.hga Exp $
 */
public class LC94 {

    public List<Integer> inorderTraversal(TreeNode root){

        List<Integer> traversalResult = new ArrayList<>();
        if(root==null){
            return traversalResult;
        }

        inorderTraversal(root,traversalResult);
        return traversalResult;

    }

    public void inorderTraversal(TreeNode root,List<Integer> traversalResult){

        if(root==null){
            return;
        }
        inorderTraversal(root.left,traversalResult);
        traversalResult.add(root.val);
        inorderTraversal(root.right,traversalResult);

    }

}