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

public class CheckValidBSTRecursive {
	public boolean checkValidBST(BinarySearchTreeNode root) {
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public boolean isBST(BinarySearchTreeNode root, int min, int max) {
		if (root == null)
			return true;
		return (root.data > min && root.data < max && isBST(root.left, min, root.data) && isBST(root.right, root.data, max));
	}
}
