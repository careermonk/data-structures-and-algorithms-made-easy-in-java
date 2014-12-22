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

package chapter04stacks;

import java.util.Stack;

public class SortingStack {
    public static Stack<Integer> sort(Stack<Integer> stk) {
        Stack<Integer> rstk = new Stack<Integer>();
        while(!stk.isEmpty()){
            int tmp = stk.pop();
            while(!rstk.isEmpty() && rstk.peek() > tmp){
                stk.push(rstk.pop());
            }
            rstk.push(tmp);
        }
        return rstk;
    }
}
