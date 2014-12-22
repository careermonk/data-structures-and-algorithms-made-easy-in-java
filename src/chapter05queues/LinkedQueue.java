/*Copyright (c) Dec 21, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: LinkedQueue.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter05queues;
import chapter03linkedlists.*;

public class LinkedQueue{
	private int length;
	private ListNode front, rear;

	//  Creates an empty queue.
	public LinkedQueue(){
		length = 0;
		front = rear = null;
	}

	//  Adds the specified data to the rear of the queue.
	public void enqueue (int data){
		ListNode node = new ListNode(data);
		if (isEmpty())
			front = node;
		else
			rear.setNext (node);
		rear = node;
		length++;
	}

	//  Removes the data at the front of the queue and returns a
	//  reference to it. Throws an Exception if the
	//  queue is empty.

	public int dequeue() throws Exception{
		if (isEmpty())
			throw new Exception ("queue");
		int result = front.getData();
		front = front.getNext();
		length--;
		if (isEmpty())
			rear = null;
		return result;
	}

	//  Returns a reference to the data at the front of the queue.
	//  The data is not removed from the queue.  Throws an
	//  Exception if the queue is empty.  
	public int first() throws Exception{
		if (isEmpty())
			throw new Exception(); 

		return front.getData();
	}

	//  Returns true if this queue is empty and false otherwise. 
	public boolean isEmpty(){
		return (length == 0);
	}

	//  Returns the number of elements in this queue.
	public int size(){
		return length;
	}

	//  Returns a string representation of this queue. 
	public String toString(){
		String result = "";
		ListNode current = front;
		while (current != null){
			result = result + current.toString() + "\n";
			current = current.getNext();
		}
		return result;
	}
}

