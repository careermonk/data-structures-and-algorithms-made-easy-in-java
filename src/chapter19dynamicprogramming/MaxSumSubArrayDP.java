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

package chapter19dynamicprogramming;

public class MaxSumSubArrayDP {
    public int maxSubArray(int[] A) {
        int maxSum = A[0], sum = 0;
        for(int i = 0; i < A.length; ++i){
            sum = Math.max(sum + A[i], A[i]);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
