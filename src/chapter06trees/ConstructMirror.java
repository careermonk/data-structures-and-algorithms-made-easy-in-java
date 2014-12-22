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

public class ConstructMirror {
	public BinaryTreeNode MirrorOfBinaryTree(BinaryTreeNode root) {
		BinaryTreeNode  temp;
		if(root != null) {
			MirrorOfBinaryTree(root.getLeft());
			MirrorOfBinaryTree(root.right);
			/* swap the pointers in this node */
			temp  = root.getLeft();
			root.setLeft(root.right);
			root.right = temp;
		}
		return root;
	}
}
