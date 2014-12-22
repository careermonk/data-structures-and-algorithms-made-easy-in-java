/*Copyright (c) Dec 22, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: FillNextSiblingsWithRecursion.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter06trees;

public class FillNextSiblingsWithRecursion {
	public static void fillNextSiblings(SiblingBinaryTreeNode root) {
		if (root == null) 
			return;
		if (root.getLeft() != null)
			root.getLeft().setNextSibling(root.getRight());
		if (root.getRight() != null)
			if(root.getNextSibling() != null)
				root.getRight().setNextSibling(root.getNextSibling().getLeft());
			else	root.getRight().setNextSibling(null);
		fillNextSiblings(root.getLeft());
		fillNextSiblings(root.getRight());
	}
}
