/*Copyright (c) Dec 22, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: FillNextSiblings.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter06trees;

import java.util.LinkedList;
import java.util.Queue;

public class FillNextSiblingsWithLevelOrder {
    public static void fillNextSiblings(SiblingBinaryTreeNode root) {
    	SiblingBinaryTreeNode tmp = null;
    	if (root == null)
			return;
		// Initialization
		Queue<SiblingBinaryTreeNode> q = new LinkedList<SiblingBinaryTreeNode>();
		q.offer(root);
		q.offer(null);
		while (!q.isEmpty()) {
			tmp = q.poll();
			if (tmp != null) {
				tmp.setNextSibling(q.peek());
				if (tmp.getLeft() != null)
					q.offer(tmp.getLeft());
				if (tmp.right != null)
					q.offer(tmp.right);
			} else {
				// completion of a level;
				if (!q.isEmpty())
					q.offer(null);
			}
		}
    }
}
