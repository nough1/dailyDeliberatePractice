/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.tw1hupup.bfs.lc101;

/**
 * 定义一个二叉树节点
 * @author guoan.hga
 * @version : TreeNode.java, v 0.1 2021年06月19日 5:08 下午 guoan.hga Exp $
 */
public class TreeNode {

    public TreeNode(int val) { this.val = val; }

    public TreeNode(int val ,TreeNode left,TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public  int val;

    public TreeNode left ;

    public TreeNode right ;

    /**
     * Getter method for property value.
     *
     * @return property value of value
     */
    public int getVal() {
        return val;
    }

    /**
     * Setter method for property value.
     *
     * @param val value to be assigned to property value
     */
    public void setVal(int val) {
        this.val = val;
    }

    /**
     * Getter method for property left.
     *
     * @return property value of left
     */
    public TreeNode getLeft() {
        return left;
    }

    /**
     * Setter method for property left.
     *
     * @param left value to be assigned to property left
     */
    public void setLeft(TreeNode left) {
        this.left = left;
    }

    /**
     * Getter method for property right.
     *
     * @return property value of right
     */
    public TreeNode getRight() {
        return right;
    }

    /**
     * Setter method for property right.
     *
     * @param right value to be assigned to property right
     */
    public void setRight(TreeNode right) {
        this.right = right;
    }
}