/*Copyright (c) Dec 21, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package chapter6trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepthInBinaryTreeWithLevelOrder {
    public int maxDepthLevelOrder(BinaryTreeNode root){
    	if(root == null)
            return 0;
        int maxDepth = 1;
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.offer(root);
        q.offer(null);
        while(!q.isEmpty()){
        	BinaryTreeNode tmp = q.poll();
            if(tmp != null){
                if(tmp.left != null)
                    q.offer(tmp.left);
                if(tmp.right != null)
                    q.offer(tmp.right);
            }else{
                if(!q.isEmpty()){
                    ++maxDepth;
                    q.offer(null);
                }
            }
        }
        return maxDepth;
    }
}
