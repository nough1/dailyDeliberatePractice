/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.tw1hupup.bfs.lc102;

import com.tw1hupup.bfs.lc101.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/**
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 * 二叉树层次遍历问题 - 使用 BFS 来解决
 * @author guoan.hga
 * @version : LC102.java, v 0.1 2021年06月27日 11:01 上午 guoan.hga Exp $
 */
public class LC102 {

    public List<List<Integer>> levelOrder(TreeNode root){

        List<List<Integer>> traversalResult = new ArrayList<>();

        // 边界处理

        if(root==null){
            return traversalResult;
        }

        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        while (nodeQueue.size()!=0){

            int size = nodeQueue.size();
            List<Integer> currentLevelNodeList = new ArrayList<>();
            for(int i=0;i<size;i++){

                TreeNode node = nodeQueue.poll();
                currentLevelNodeList.add(node.val);
                if(node.left!=null){
                    nodeQueue.add(node.left);
                }
                if(node.right!=null){
                    nodeQueue.add(node.right);
                }

            }
            traversalResult.add(currentLevelNodeList);
        }

        return traversalResult;

    }

}