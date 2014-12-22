/*Copyright (c) Dec 22, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: StackSets.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter04stacks;

import java.util.ArrayList;

public class StackSets{
	// Number of elements for each stack
    private int threshold;
    private ArrayList<StackForStackSets> listOfStacks = new  ArrayList<StackForStackSets>();
     
    StackSets(int threshold) {
        this.threshold = threshold;        
    }
    //get the last stack
    public StackForStackSets getLastStack(){
        int size = listOfStacks.size();
        if(size <= 0) 
        	return null;
        else return listOfStacks.get(size - 1);
    }
     
    //get the nth stack
    public StackForStackSets getNthStack(int n){
    	System.out.println(n);
        int size = listOfStacks.size();
        if(size <= 0) 
        	return null;
        else return listOfStacks.get(n - 1);
    }
     
    //push value
    public void push(int value){
    	StackForStackSets lastStack = this.getLastStack();
         
        if(lastStack == null){
            lastStack = new StackForStackSets(threshold);
            lastStack.push(value);
            listOfStacks.add(lastStack);
        }else {
            if( !lastStack.isAtCapacity())
                lastStack.push(value);
            else {
            	StackForStackSets newLastStack = new StackForStackSets(threshold);
                newLastStack.push(value);
                listOfStacks.add(newLastStack);
            }
        }    
    }
    // the pop 
    public int pop(){
    	StackForStackSets lastStack = this.getLastStack();
        int v = lastStack.pop();
        if(lastStack.size() == 0) listOfStacks.remove(listOfStacks.size() -  1);
        return v;
    }
     
     
    //pop from the nth stack
    public int pop(int nth){
    	StackForStackSets nthStack = this.getNthStack(nth);
         int v = nthStack.pop();
         if(nthStack.size() == 0) listOfStacks.remove(listOfStacks.size() -  1);
         return v;   
         
    }
     
    public String toString(){
        String s = "";
        for(int i = 0; i < listOfStacks.size(); i++){
        	StackForStackSets stack = listOfStacks.get(i);
            s = "Stack "+ i + ": " + stack.toString() +  s;
        }
         
        return s;
    }
     
     
    public static void main(String[] args){
    	StackSets stacks = new StackSets(3);
        stacks.push(10); stacks.push(9); stacks.push(8);
        stacks.push(7); stacks.push(6); stacks.push(5);
        stacks.push(4); stacks.push(3); stacks.push(2);

        System.out.println("Popping " + stacks.pop(2));
        System.out.println("Popping from stack 1" + stacks.pop(1));
        System.out.println("Popping " + stacks.pop(3));
        System.out.println("Popping " + stacks.pop(2));
        System.out.println("the stack is: " + stacks);
    }
}