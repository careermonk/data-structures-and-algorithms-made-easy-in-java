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

package chapter06trees;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepth {
    public int minDepth(BinaryTreeNode root) {
        if(root == null) return 0;
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.offer(root);
        q.offer(null);
        int count = 1;
        while(!q.isEmpty()){
            BinaryTreeNode currentNode = q.poll();
            if(currentNode != null){
                if(currentNode.getLeft() == null && currentNode.right == null){
                    return count;
                }
                if(currentNode.getLeft() != null){
                    q.offer(currentNode.getLeft());
                }
                if(currentNode.right != null){
                    q.offer(currentNode.right);
                }   
            }else{
                if(!q.isEmpty()){
                    count++;
                    q.offer(null);
                }
            }
        }
        return count;
    }
}
