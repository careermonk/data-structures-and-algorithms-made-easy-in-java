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

public class BinaryTreeNode {	
	public int data;	
	public BinaryTreeNode left;
	public BinaryTreeNode right;
	
	public BinaryTreeNode(int data){
		this.data = data;
		left = null;
		right = null;
	}
	public BinaryTreeNode(int data, BinaryTreeNode left, BinaryTreeNode right){
		this.data = data;
		this.left = left;
		this.right = right;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public BinaryTreeNode getLeft() {
		return left;
	}
	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}
	public BinaryTreeNode getRight() {
		return right;
	}
	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}
	// Sets the data stored in this node.
	public String toString1(){
		return Integer.toString(data);
	}	
	// Sets the data in this BinaryTreeNode node.
	public void setValue(int data) {
		this.data = data;
	}
	
	// Tests whether this node is a leaf node.
	public boolean isLeaf() {
		return left == null && right == null;
	}


	// Tests whether the root argument contains within itself the data argument.
	public static boolean findInBT(BinaryTreeNode root, int  data) {
		if (root == null)
		    return false;
		if (root.getData() == data)
		    return true;
		return findInBT(root.getLeft(), data)  || findInBT(root.getRight(), data);
	}
	// Returns a String representation of this BinaryTreeNode.
	public String toString() {
		if (isLeaf()) {
			return this.toString1();
		}
		else {
			    String root, left = "null", right = "null";
			    root = this.toString1();
			    if (getLeft() != null) {
					left = getLeft().toString();
			    }
			    if (getRight() != null) {
					right = getRight().toString();
			    }
			    return root + " (" + left + ", " + right + ")";
		}
	}
	
	// Computes a hash code for the complete binary tree rooted at this BinaryTreeNode node.
	public int hashCode() {
		int result = this.hashCode();
		if (left != null) {
			result += 3 * left.hashCode();
		}
		if (right != null) {
			result += 7 * right.hashCode();
		}
		return result;
	}

	// Returns the total number of nodes in this binary tree (include the root in the count).
	public int numberOfNodes() {
		int leftCount = this.left == null ? 0 : left.numberOfNodes();
		int rightCount = this.right == null ? 0 : right.numberOfNodes();
		return 1 + leftCount + rightCount;
	}

	// Returns a new BinaryTreeNode equal to (but not the same as) this binary tree.
	// Every node in this new BinaryTreeNode will be created by the copy method; values
	// will be identical (==) to values in the given binary tree.
	public BinaryTreeNode copy() {
		BinaryTreeNode left =  null, right = null;
		if (this.left != null) {
			left = this.left.copy();
		}
		if (this.right != null) {
			right = this.right.copy();
		}
		return new BinaryTreeNode(this.data, left, right);
	}
	
	// Returns a new binary tree which is the mirror image of the binary tree whose
	// root is at this binary tree. That is, for every node in the new binary tree,
	// its children are in reverse order (left child becomes right child, right
	// child becomes left child).
	public BinaryTreeNode reverse() {
		BinaryTreeNode left =  null, right = null;
		if (this.left != null) {
			left = this.left.reverse();
		}
		if (this.right != null) {
			right = this.right.reverse();
		}
		return new BinaryTreeNode(this.data, right, left);
	}

	// Rearranges the binary tree rooted at this binary tree to be the mirror image
	// of its original structure. No new BinaryTreeNode nodes are created in this
	// process.
	public void reverseInPlace() {
		if (this.left != null) {
			left.reverseInPlace();
		}
		if (this.right != null) {
			right.reverseInPlace();
		}
		BinaryTreeNode temp = this.left;
		this.setLeft(this.right);
		this.setRight(temp);
	}	
}
