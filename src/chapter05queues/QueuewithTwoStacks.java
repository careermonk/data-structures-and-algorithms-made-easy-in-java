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

package chapter05queues;

import java.util.Stack;

public class QueuewithTwoStacks<T> {
    private Stack<T> S1 = new Stack<T>();
    private Stack<T> S2 = new Stack<T>();
    public void enqueue(T data){
        S1.push(data);
    }
    public T dequeue(){
        if(S2.empty())
            while(!S1.isEmpty()){
                S2.push(S1.pop());
            }
        return S2.pop();
    }
}