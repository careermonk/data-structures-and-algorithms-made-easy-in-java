/*Copyright (c) Dec 21, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: DiameterOfTree.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter06trees;

public class DiameterOfTree {
	public static int diameter = 0;
	
	public int diameterOfTree(BinaryTreeNode root){
		int left, right;
		if(root == null) 
			return 0;
		left = diameterOfTree(root.getLeft());
		right = diameterOfTree(root.getRight());
		if(left + right > diameter)
			diameter = left + right;
		return Math.max(left, right)+1;
	}
	// Alternative Coding
	public int diameter(BinaryTreeNode root){
		if(root==null) return 0;

		//the path goes through the root
		int len1 = height(root.left) + height(root.right) +3;

		//the path does not pass the root
		int len2 = Math.max(diameter(root.left), diameter(root.right));

		return Math.max(len1, len2);
	}
	public int height(BinaryTreeNode root) {
		if(root == null) 
			return 0;
		/* compute the depth of each subtree */
		int leftDepth = height(root.getLeft());
		int rightDepth = height(root.right);
		return (leftDepth > rightDepth) ? leftDepth + 1 : rightDepth + 1;
	} 
}
