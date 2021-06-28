package com.tw1hupup.link;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/classic/problems/linked-list-cycle/description/
 * leetcode 121
 */
public class LC141 {

    public boolean hasCycle(ListNode head){

        ListNode currentNode = head ;
        Map<ListNode,Integer> nodeIndexMap = new HashMap<>();
        int index = 0 ;
        while(currentNode!=null){

            if(nodeIndexMap.get(currentNode)!=null){
                return true ;
            }
            nodeIndexMap.put(currentNode,index);
            index++;
            currentNode = currentNode.next;
        }

        return false;
    }

}
