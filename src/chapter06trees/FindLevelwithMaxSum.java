/*Copyright (c) Dec 21, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: FindLevelwithMaxSum.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter06trees;

import java.util.LinkedList;
import java.util.Queue;

public class FindLevelwithMaxSum {
	public int findLevelwithMaxSum(BinaryTreeNode root) {
		int maxSum = 0, currentSum = 0;
		if (root == null)
			return 0;
		// Initialization
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		q.offer(null);
		while (!q.isEmpty()) {
			BinaryTreeNode tmp = q.poll();
			if (tmp != null) {
				currentSum += tmp.getData();
				if (tmp.getLeft() != null)
					q.offer(tmp.getLeft());
				if (tmp.right != null)
					q.offer(tmp.right);
			} else {
				if (currentSum > maxSum){
					maxSum =  currentSum;
				}
				currentSum = 0;
				// completion of a level;
				if (!q.isEmpty())
					q.offer(null);
			}
		}
		return maxSum;
	}
}
