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

public class ExpressionEvaluation {
    public int expressionEvaluation(String[] tokens) {
        Stack<Integer> s = new Stack<Integer>();
        for(String token : tokens){
            if(token.equals("+")){
                int op1 = s.pop();
                int op2 = s.pop();
                int res = op1+op2;
                s.push(res);
            }else if(token.equals("-")){
                int op1 = s.pop();
                int op2 = s.pop();
                int res = op2-op1;
                s.push(res);
            }else if(token.equals("*")){
                int op1 = s.pop();
                int op2 = s.pop();
                int res = op1 * op2;
                s.push(res);
            }else if(token.equals("/")){
                int op1 = s.pop();
                int op2 = s.pop();
                int res = op2 / op1;
                s.push(res);
            }else{
                s.push(Integer.parseInt(token));
            }
        }
        return s.pop();
    }
}
