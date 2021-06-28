/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.tw1hupup.dfs.lc200;

/**
 * https://leetcode-cn.com/problems/number-of-islands/
 * 岛屿的数量问题 - 使用深度优先搜索来解决
 * @author guoan.hga
 * @version : LC200.java, v 0.1 2021年06月27日 10:38 上午 guoan.hga Exp $
 */
public class LC200 {

    public int numIsIslands(char[][] grid){

        // 岛屿数量
        int isLandNum = 0 ;

        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++){

                if(grid[i][j]=='1'){

                    // 陆地进行深度遍历
                    dfsLand(grid,i,j);
                    isLandNum++;
                }
            }

        return isLandNum;


    }

    public void dfsLand(char[][] grid,int row,int col){

        if(row<0 || col<0 ||row>=grid.length || col >=grid[0].length){
            return;
        }
        if(grid[row][col]!='1'){
            return;
        }
        grid[row][col] = '2';

        dfsLand(grid,row+1,col);
        dfsLand(grid,row-1,col);
        dfsLand(grid,row,col+1);
        dfsLand(grid,row,col-1);


    }

}