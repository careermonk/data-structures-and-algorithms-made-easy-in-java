/*Copyright (c) Dec 21, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by	: Narasimha Karumanchi 
 * Book Title		: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 				warranty; without even the implied warranty of 
 * 				merchantability or fitness for a particular purpose. 
 * 
 */
package chapter10sorting;

public class MergeTwoSortedArrays {
	public void merge(int A[], int m, int B[], int n) {
		while (n > 0) {
			// the original A has all merged into the new A, and merge the left
			// B
			if (m <= 0 || A[m - 1] < B[n - 1])
				A[n + m - 1] = B[--n];
			else
				A[n + m - 1] = A[--m];
		}
	}
}
