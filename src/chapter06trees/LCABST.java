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

public class LCABST {
	public BinarySearchTreeNode LCA(BinarySearchTreeNode root, BinarySearchTreeNode a, BinarySearchTreeNode b) {
		if (root == null)
			return root;
		if (root == a || root == b)
			return root;
		if (Math.max(a.data, b.data) < root.data) // a.data < root.data && b.data < root.data
			return LCA(root.left, a, b);
		else if (Math.min(a.data, b.data) > root.data) // a.data > root.data && b.data > root.data
			return LCA(root.right, a, b);
		else
			return root;
	}
}
