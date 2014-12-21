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

package chapter11searching;

public class BinarySearchRotatedIterative {
    public boolean search(int[] A, int data) {
        int left = 0;
        int right = A.length - 1;
        while(left <= right){
            // Avoid overflow
            int mid = left + (right - left) / 2;
            if(A[mid] == data)
                return true;
            
            // the bottom half is sorted;
            if(A[left] < A[mid]){
                if(A[left] <= data && data < A[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            
            // the upper half is sorted;
            else if(A[left] > A[mid]){
                if(A[mid] < data && data <= A[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }else{
                // skip duplicate one, A[start] == A[mid];
                left++;
            }
        }
        return false;
    }
}
