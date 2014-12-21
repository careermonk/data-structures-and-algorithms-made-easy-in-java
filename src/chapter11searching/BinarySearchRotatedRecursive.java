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

public class BinarySearchRotatedRecursive {
	public int search(int[] A, int left, int right, int data) {
		if(left > right) return -1;
		int mid = left + (right - left) / 2;
		if(data == A[mid]) return mid;
		else if(A[left] <= A[mid]) { 	// start half is in sorted order.
			if(data >= A[left] && data < A[mid])
				return search(A, left, mid - 1, data);
			else 	return search(A, mid + 1, right, data);
		} 
		else { 	// A[mid] <= A[right], right half is in sorted order.
			if(data > A[mid] && data <= A[right])
				return search(A, mid + 1, right, data);
			else	return search(A, left, mid - 1, data);
		}
	}
}
