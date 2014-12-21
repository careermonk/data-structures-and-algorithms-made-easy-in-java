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

package chapter10sorting;

public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] A) {
		int len = A.length;
		int i = 0;
		if (len <= 1)
			return len;
		for (int j = 1; j < len; j++) {
			if (A[j] != A[i])
				A[++i] = A[j];
		}
		return i + 1;
	}
}
