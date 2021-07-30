package com.tw1hupup.dfs.lc236;

import com.tw1hupup.bfs.lc101.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/
 * 二叉树的最近公共祖先问题
 */
public class LC236 {

    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p, TreeNode q){


        // 深度优先遍历

        // 获取 p  的祖先

        // 获取 q 的祖先，看在不在 p 的祖先里

        Map<TreeNode,TreeNode> parentMap = new HashMap<>();

        dfs(root,parentMap);

        Map<TreeNode,TreeNode> pParentMap = new HashMap<>();

        TreeNode current = p;

        while (current!=null){

            pParentMap.put(current, p);
            TreeNode ancestor = parentMap.get(current);
            current = ancestor;
        }

        current = q ;

        while (current!=null){

            if(pParentMap.get(current)!=null){
                return current;
            }
            TreeNode ancestor = parentMap.get(current);
            current = ancestor;
        }

        return null ;

    }

    public void dfs(TreeNode root,Map<TreeNode,TreeNode> parentMap){

        if(root==null){
            return;
        }
        if(root.left!=null){
            parentMap.put(root.left,root);
            dfs(root.left,parentMap);
        }
        if(root.right!=null){
            parentMap.put(root.right,root);
            dfs(root.right,parentMap);
        }

    }
}
