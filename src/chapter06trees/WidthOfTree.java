/*Copyright (c) Dec 21, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: WidthOfTree.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter06trees;
public class WidthOfTree {
	   //The width of a binary tree is the maximum number of elements on one level of the tree.
	   public int width(BinaryTreeNode root)
	   {
	      int max = 0;
	      int height = maxDepthRecursive(root);
	      for(int k = 0; k <= height; k++)
	      {
	         int tmp = width(root, k);
	         if(tmp > max) max = tmp;
	      }
	      return max;
	   }
	   // Returns the number of node on a given level
	   public int width(BinaryTreeNode root, int depth)
	   {
	      if(root==null) 
	    	  return 0;
	      else
		      if(depth == 0) 
		    	  return 1;
		      else
		    	  return width(root.left, depth-1) + width(root.right, depth-1);
	   }
	    public int maxDepthRecursive(BinaryTreeNode root) {
	        if(root == null) return 0;
	        /* compute the depth of each subtree */
	        int leftDepth = maxDepthRecursive(root.getLeft());
	        int rightDepth = maxDepthRecursive(root.right);
	        return (leftDepth > rightDepth) ? leftDepth + 1 : rightDepth + 1;
	    } 
}
