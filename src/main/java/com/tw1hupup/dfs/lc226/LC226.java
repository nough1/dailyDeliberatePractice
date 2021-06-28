/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.tw1hupup.dfs.lc226;

import com.tw1hupup.bfs.lc101.TreeNode;


/**
 * https://leetcode-cn.com/problems/invert-binary-tree/
 * 二叉树反转
 * 思路上错了，以为需要重新构建一棵树，没想到思路想通了，之后这么简单 ，
 * 先把左子树反转，再把右子树反转
 * @author guoan.hga
 * @version : LC226.java, v 0.1 2021年06月27日 11:33 上午 guoan.hga Exp $
 */
public class LC226 {

    public TreeNode invertTree(TreeNode root) {

        if(root==null){
            return root;
        }

        // 左子树反转

        invertTree(root.left);

        // 右子树反转

        invertTree(root.right);


        TreeNode temp = root.left ;
        root.left = root.right;
        root.right = temp;

        return root;

    }
}