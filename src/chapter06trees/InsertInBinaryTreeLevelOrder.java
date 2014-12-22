/*Copyright (c) Dec 21, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: InsertInBinaryTreeLevelOrder.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter06trees;

import java.util.LinkedList;
import java.util.Queue;

public class InsertInBinaryTreeLevelOrder {
    public BinaryTreeNode insertInBinaryTreeLevelOrder(BinaryTreeNode root, int data){
    	if(root == null)
            return null;
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.offer(root);
        while(!q.isEmpty()){
        	BinaryTreeNode tmp = q.poll();
            if(tmp != null){
                if(tmp.getLeft() != null)
                    q.offer(tmp.getLeft());
                else{
                	tmp.left = new BinaryTreeNode(data);
                	return root;
                }
                if(tmp.right != null)
                    q.offer(tmp.right);
                else{
                	tmp.right = new BinaryTreeNode(data);
                	return root;
                }
            }
        }
		return root;
    }
}
