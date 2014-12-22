/*Copyright (c) Dec 22, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: StackForStackSets.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter04stacks;

class StackForStackSets {
    
    private int top = -1;   
    private int[] arr;
    // Maximum size of stack
    private int capacity;
     
    StackForStackSets(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
    }
     
    public void push(int v){
        arr[++top] = v;
    }
     
    public int pop(){
         
        return arr[top--];
    }
    
    // if the stack is at capacity
    public Boolean isAtCapacity(){
        return capacity == top + 1;
    }
    
    //return the size of the stack
    public int size(){
        return top+1;
    }
     
    public String toString(){
        String s = "";
        int index = top;
        while(index >= 0){
            s += "[" + arr[index--] + "]"+ " --> ";
        }
        return s;
         
    }
}
