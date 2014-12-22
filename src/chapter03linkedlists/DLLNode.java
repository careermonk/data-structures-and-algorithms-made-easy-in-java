/*Copyright (c) Dec 21, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: DLLNode.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter03linkedlists;

public class DLLNode {
	public int data;
	public DLLNode prev;
	public DLLNode next;

	public DLLNode(int data) {
		this.data = data;
		prev = null;
		next = null;
	} 
	
	public DLLNode(int data, DLLNode prev, DLLNode next) {
		this.data = data;
		this.prev = prev;
		this.next = next;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public DLLNode getPrev() {
		return prev;
	} 

	public DLLNode getNext() {
		return next;
	} 

	public void setPrev(DLLNode where) {
		prev = where;
	} 

	public void setNext(DLLNode where) {
		next = where;
	} 
} 
