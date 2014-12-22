/*Copyright (c) Dec 21, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: InsertInBinaryTree.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter06trees;


public class InsertInBinaryTreeRecursive {
	public void insert(BinaryTreeNode root, int data) {
		if (root == null) {
			root = new BinaryTreeNode(data);
		} else {
			insertHelper(root, data);
		}
	}

	private void insertHelper(BinaryTreeNode root, int data) {
		if (root.data >= data) {	// It is not compulsory to put this check.
			if (root.left == null) {
				root.left = new BinaryTreeNode(data);
			} else {
				insertHelper(root.right, data);
			}
		} else {
			if (root.right == null) {
				root.right = new BinaryTreeNode(data);
			} else {
				insertHelper(root.right, data);
			}
		}
	}
}
