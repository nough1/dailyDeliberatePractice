package com.tw1hupup.dfs.lc617;

import com.tw1hupup.bfs.lc101.TreeNode;

/**
 * 合并二叉数
 * https://leetcode-cn.com/problems/merge-two-binary-trees/
 */
public class LC617 {

    public TreeNode mergeTrees(TreeNode root1,TreeNode root2){

        if(root1==null && root2==null){
            return null ;
        }
        if(root1==null){
            return root2;
        }
        if(root2==null){
            return root1;
        }
        TreeNode root = new TreeNode(root1.val+root2.val);
        root.left = mergeTrees(root1.left,root2.left);
        root.right = mergeTrees(root1.right,root2.right);
        return root;

    }

}
