/*Copyright (c) Dec 21, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: DynamicArrayStack.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter04stacks;

public class DynamicArrayStack{
	// Length of the array used to implement the stack.
	protected int capacity;

	// Default array capacity.
	public static final int CAPACITY = 16;	// power of 2
	
	public static int MINCAPACITY=1<<15; // power of 2

	// Array used to implement the stack.
	protected int[] stackRep;

	// Index of the top element of the stack in the array.
	protected int top = -1;

	// Initializes the stack to use an array of default length.
	public DynamicArrayStack() {
		this(CAPACITY); // default capacity
	}

	// Initializes the stack to use an array of given length.
	public DynamicArrayStack(int cap) {
		capacity = cap;
		stackRep = new int[capacity]; // compiler may give warning, but this
									  // is ok
	}

	// Returns the number of elements in the stack. This method runs in O(1) time.
	public int size() {
		return (top + 1);
	}

	// Checks whether the stack is empty. This method runs in O(1) time.
	public boolean isEmpty() {
		return (top < 0);
	}

	// Inserts an element at the top of the stack. This method runs in O(1) time.
	public void push(int data) throws Exception {
		if (size() == capacity)
			expand();
		stackRep[++top] = data;
	}
	
	// Increases the stack size by double
	private void expand() {
		int length = size();
		int[] newstack=new int[length<<1];	 // or 2* length
		System.arraycopy(stackRep,0,newstack,0,length);
		stackRep=newstack;
		this.capacity = this.capacity<<1;
	}
	
	// dynamic array operation: shrinks to 1/2 if more than than 3/4 empty
	@SuppressWarnings("unused")
	private void shrink() {
		int length = top + 1;
		if(length<=MINCAPACITY || top<<2 >= length) 
			return;
		length=length + (top<<1); // still means shrink to at 1/2 or less of the heap
		if(top<MINCAPACITY) length = MINCAPACITY;
		int[] newStack=new int[length];
		System.arraycopy(stackRep,0,newStack,0,top+1);
		stackRep=newStack;
		capacity = length;
	}
	
	// Inspects the element at the top of the stack. This method runs in O(1) time.
	public int top() throws Exception {
		if (isEmpty())
			throw new Exception("Stack is empty.");
		return stackRep[top];
	}

	// Removes the top element from the stack. This method runs in O(1) time.
	public int pop() throws Exception {
		int data;
		if (isEmpty())
			throw new Exception("Stack is empty.");
		data = stackRep[top];
		stackRep[top--] = Integer.MIN_VALUE; // dereference S[top] for garbage collection.
		shrink();
		return data;
	}

	// Returns a string representation of the stack as a list of elements, with
	// the top element at the end: [ ... , prev, top ]. This method runs in O(n)
	// time, where n is the size of the stack.
	public String toString() {
		String s;
		s = "[";
		if (size() > 0)
			s += stackRep[0];
		if (size() > 1)
			for (int i = 1; i <= size() - 1; i++) {
				s += ", " + stackRep[i];
			}
		return s + "]";
	}
}
