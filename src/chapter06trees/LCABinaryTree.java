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

public class LCABinaryTree {
	public BinaryTreeNode LCA(BinaryTreeNode root, BinaryTreeNode a, BinaryTreeNode b) {
		BinaryTreeNode left, right;
		if (root == null)
			return root;
		if (root == a || root == b)
			return root;
		left = LCA(root.getLeft(), a, b);
		right = LCA(root.right, a, b);
		if (left != null && right != null)
			return root;// nodes are each on a separate branch
		else
			return (left != null ? left : right);
		// either one node is on one branch,
		// or none was found in any of the branches		
	}
}
