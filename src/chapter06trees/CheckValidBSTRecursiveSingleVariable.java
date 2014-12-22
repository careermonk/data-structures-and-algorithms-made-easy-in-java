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

public class CheckValidBSTRecursiveSingleVariable {
	private int prev = Integer.MIN_VALUE;
	public boolean checkValidBST(BinarySearchTreeNode root) {
		//Reference<Integer> prev = new Reference<Integer>(Integer.MIN_VALUE);
		return isBST(root);
	}
	public boolean isBST(BinarySearchTreeNode root) {
		if (root == null)
			return true;
   		if(!isBST(root.left)) 
            return false;
   		if(root.data < prev) 
   			return false;
   		prev = root.data;
	   	return isBST(root.right);
	}
}
