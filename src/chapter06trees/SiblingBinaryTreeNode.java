/*Copyright (c) Dec 22, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: SiblingBinaryTreeNode.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter06trees;

public class SiblingBinaryTreeNode {
	public int data;	
	public SiblingBinaryTreeNode left;
	public SiblingBinaryTreeNode right;
	public SiblingBinaryTreeNode nextSibling;
	
	public SiblingBinaryTreeNode(int data){
		this.data = data;
		left = null;
		right = null;
		nextSibling = null;
	}
	public SiblingBinaryTreeNode(int data, SiblingBinaryTreeNode left, SiblingBinaryTreeNode right, SiblingBinaryTreeNode nextSibling){
		this.data = data;
		this.left = left;
		this.right = right;
		this.nextSibling = nextSibling;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public SiblingBinaryTreeNode getLeft() {
		return left;
	}
	public void setLeft(SiblingBinaryTreeNode left) {
		this.left = left;
	}
	public SiblingBinaryTreeNode getRight() {
		return right;
	}
	public void setRight(SiblingBinaryTreeNode right) {
		this.right = right;
	}
	public SiblingBinaryTreeNode getNextSibling() {
		return nextSibling;
	}
	public void setNextSibling(SiblingBinaryTreeNode nextSibling) {
		this.nextSibling = nextSibling;
	}
	// Sets the data in this BinaryTreeNode node.
	public void setValue(int data) {
		this.data = data;
	}
	// Tests whether this node is a leaf node.
	public boolean isLeaf() {
		return left == null && right == null;
	}
}
