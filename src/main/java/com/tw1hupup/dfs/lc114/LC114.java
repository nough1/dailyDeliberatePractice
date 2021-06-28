/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.tw1hupup.dfs.lc114;

import com.tw1hupup.bfs.lc101.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/
 * 将二叉树转换成链表 - 先序排序
 * @author guoan.hga
 * @version : LC114.java, v 0.1 2021年06月27日 11:12 上午 guoan.hga Exp $
 */
public class LC114 {

    public void flatten(TreeNode root){

        List<TreeNode> nodeLinkList = new ArrayList<>();

        preOrderTraversal(root,nodeLinkList);

        for(int i=1;i<nodeLinkList.size();i++){

            TreeNode pre = nodeLinkList.get(i-1);
            pre.right = nodeLinkList.get(i);
            pre.left = null ;

        }

    }

    public void preOrderTraversal(TreeNode root,List<TreeNode> nodeListList){

        if(root==null){
            return;
        }

        nodeListList.add(root);

        preOrderTraversal(root.left,nodeListList);

        preOrderTraversal(root.right,nodeListList);


    }

}