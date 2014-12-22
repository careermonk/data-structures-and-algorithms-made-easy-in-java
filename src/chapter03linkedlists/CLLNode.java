/*Copyright (c) Dec 21, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: CLLNode.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter03linkedlists;

public class CLLNode {
	public CLLNode next;
	public int data;

	// Creates an empty node.
	public CLLNode(){
		next = null;
		data = Integer.MIN_VALUE;
	}

	// Creates a node storing the specified data.
	public CLLNode (int data){
		next = null;
		this.data = data;
	}

	// Returns the node that follows this one.
	public CLLNode getNext(){
		return next;
	}

	// Sets the node that follows this one.
	public void setNext (CLLNode node){
		next = node;
	}

	// Returns the data stored in this node.
	public int getData(){
		return data;
	}

	// Sets the data stored in this node.
	public void setData (int elem){
		data = elem;
	}
	
	// Sets the data stored in this node.
	public String toString (){
		return Integer.toString(data);
	}	
}
