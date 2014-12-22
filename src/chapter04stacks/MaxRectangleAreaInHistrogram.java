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

public class MaxRectangleAreaInHistrogram {
    public int MaxRectangleArea(int[] A) {
        Stack<Integer> s = new Stack<Integer>();
        if(A == null || A.length == 0)
            return 0;
        // Initialize max area
        int maxArea = 0;
        int i = 0;
        // run through all bars of given histogram
        while(i < A.length) {
            // If current bar is higher than the bar of the stack peek, push it to stack. 
            if(s.empty() || A[s.peek()] <= A[i])
                s.push(i++);
            else {
                // if current bar is lower than the stack peek, calculate area of rectangle with stack top as the smallest bar.
                // 'i' is 'right index' for the top and element before top in stack is 'left index'
                int top = s.pop();
                // calculate the area with A[top] stack as smallest bar and update maxArea if needed
                maxArea = Math.max(maxArea, A[top] * (s.empty() ? i : i - s.peek() - 1));
            }
        }
        // Now pop the remaining bars from stack and calculate area with every popped bar as the smallest bar.
        while(!s.isEmpty()) {
            int top = s.pop();
            maxArea = Math.max(maxArea, A[top] * (s.empty() ? i : i - s.peek() - 1));
        }
        return maxArea;
    }
}