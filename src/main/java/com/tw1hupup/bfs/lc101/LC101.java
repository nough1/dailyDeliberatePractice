/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.tw1hupup.bfs.lc101;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 对称二叉树 - 简单
 * @author guoan.hga
 * @version : LC101.java, v 0.1 2021年06月19日 5:00 下午 guoan.hga Exp $
 */
public class LC101 {

    public boolean isSymmetric(TreeNode root){

        return isSymmetric(root,root);

    }

    public boolean isSymmetricWithQueue(TreeNode root){

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        // 为什么要 add 两次呢
        queue.add(root);

        while (!queue.isEmpty()){

            TreeNode t1 = queue.poll();
            TreeNode t2 = queue.poll();
            if(t1==null && t2==null){
                continue;
            }
            if(t1==null || t2==null){
                return false;
            }
            if(t1.val!=t2.val){
                return false;
            }
            queue.add(t1.left);
            queue.add(t2.right);
            queue.add(t1.right);
            queue.add(t2.left);

        }

        return true;
    }

    public boolean isSymmetric(TreeNode left,TreeNode right){

        // 处理有一颗树有可能为空的情况
        if(left==null && right==null){
            return true;
        }

        if(left==null || right==null){
            return false;
        }

        if(left.val ==right.val && isSymmetric(left.right,right.left) && isSymmetric(left.left,right.right)){
            return true ;
        }
        return false;
    }
}