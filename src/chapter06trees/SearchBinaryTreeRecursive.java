/*Copyright (c) Dec 21, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: SearchBinaryTreeRecursive.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter06trees;

public class SearchBinaryTreeRecursive {
	// Tests whether the root argument contains within itself the data argument.
	public static boolean findInBT(BinaryTreeNode root, int  data) {
		if (root == null)
		    return false;
		if (root.getData() == data)
		    return true;
		return findInBT(root.getLeft(), data)  || findInBT(root.getRight(), data);
	}
}
