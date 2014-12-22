/*Copyright (c) Dec 21, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: FixedSizeArrayQueue.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter05queues;

public class FixedSizeArrayQueue{ 
	// Array used to implement the queue.
	private int[] queueRep;
	private int size, front, rear;
	
	// Length of the array used to implement the queue.
	private static final int CAPACITY = 16;	//Default Queue size

	// Initializes the queue to use an array of default length.
	public FixedSizeArrayQueue (){
		queueRep = new int [CAPACITY];
		size  = 0; front = 0; rear  = 0;
	}
	
	// Initializes the queue to use an array of given length.
	public FixedSizeArrayQueue (int cap){
		queueRep = new int [ cap];
		size  = 0; front = 0; rear  = 0;
	}
	
	// Inserts an element at the rear of the queue. This method runs in O(1) time.
	public void enQueue (int data)throws NullPointerException, IllegalStateException{  
		if (size == CAPACITY)
			throw new IllegalStateException ("Queue is full: Overflow");
		else {
			size++;
			queueRep[rear] = data;
			rear = (rear+1) % CAPACITY;
		}
	}

	// Removes the front element from the queue. This method runs in O(1) time.
	public int deQueue () throws IllegalStateException{
		// Effects:   If queue is empty, throw IllegalStateException,
		// else remove and return oldest element of this
		if (size == 0)
			throw new IllegalStateException ("Queue is empty: Underflow");
		else {
			size--;
			int data = queueRep [ (front % CAPACITY) ];
			queueRep [front] = Integer.MIN_VALUE;
			front = (front+1) % CAPACITY;
			return data;
		}
	}

	// Checks whether the queue is empty. This method runs in O(1) time.
	public boolean isEmpty(){ 
		return (size == 0); 
	}
	
	// Checks whether the queue is full. This method runs in O(1) time.
	public boolean isFull(){ 
		return (size == CAPACITY); 
	}
	
	// Returns the number of elements in the queue. This method runs in O(1) time.
	public int size() {
		return size;
	}
	
	// Returns a string representation of the queue as a list of elements, with
	// the front element at the end: [ ... , prev, rear ]. This method runs in O(n)
	// time, where n is the size of the queue.	
	public String toString(){
		String result = "[";
		for (int i = 0; i < size; i++){
			result += Integer.toString(queueRep[ (front + i) % CAPACITY ]);
			if (i < size -1) {
				result += ", ";
			}
		}
		result += "]";
		return result;
	}

}