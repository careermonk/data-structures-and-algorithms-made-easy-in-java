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

package chapter07priorityqueues;
class ListNode {
	int data;
	ListNode next;
 
	ListNode(int x) {
		data = x;
		next = null;
	}
	public int getData(){
		return this.data;
	}
	public void setData(int data){
		this.data = data;
	}
	public ListNode getNext(){
		return this.next;
	}
	public void setNext(ListNode node){
		this.next = node;
	}
}