package chapter06trees;

/*Copyright (c) Dec 21, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: MaxInBinaryTree.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

public class MaxInBinaryTreeRecursive {
	public int maxInBinaryTree(BinaryTreeNode root){
	    int maxValue = Integer.MIN_VALUE;
	    if (root != null){
	        int leftMax = maxInBinaryTree(root.getLeft());
	        int rightMax = maxInBinaryTree(root.right);
	         
	        if (leftMax > rightMax)
	        	maxValue = leftMax;
	        else
	        	maxValue = rightMax;
	             
	        if (root.data > maxValue)
	        	maxValue = root.data;
	    }
	    return maxValue;
	}
}
