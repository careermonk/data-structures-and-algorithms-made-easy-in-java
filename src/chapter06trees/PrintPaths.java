/*Copyright (c) Dec 21, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: PrintPaths.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter06trees;

public class PrintPaths {
	public void printPaths(BinaryTreeNode  root) {
		  int[] path = new int[256];
		  printPaths(root, path, 0);
	}
	private void printPaths(BinaryTreeNode  root, int[] path, int pathLen) {
		if (root == null) return;
		// append this node to the path array
		path[pathLen] = root.getData();
		pathLen++;
		// it's a leaf, so print the path that led to here
		if (root.getLeft() == null && root.getRight() == null) {
			printArray(path, pathLen);
		}
		else {	// otherwise try both subtrees
			printPaths(root.getLeft(), path, pathLen);
			printPaths(root.getRight(), path, pathLen);
		}
	}
	private void printArray(int[] ints, int len) {
		for (int i=0; i<len; i++) {
			System.out.print(ints[i] + " ");
		}
		System.out.println();
	}
}
