package com.tw1hupup.dfs.lc104;

import com.tw1hupup.bfs.lc101.TreeNode;

/**
 * https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 * 二叉树的最大深度
 */
public class LC104 {

    public int maxDepth(TreeNode root){

        if(root==null){
            return 0;
        }

        int leftTreeMaxDepth = maxDepth(root.left);

        int rightTreeMaxDepth = maxDepth(root.right);

        return Math.max(leftTreeMaxDepth,rightTreeMaxDepth)+1;

    }

}
