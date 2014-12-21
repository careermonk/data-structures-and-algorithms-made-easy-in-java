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

package chapter12selectionalgorithms;

public class KthSmallest {
	public static int partition(int[] A, int start, int end) {
	    int pivot = A[start];
	    int pivotPosition = start++;
	    while (start <= end) {
	        // scan for values less than the pivot
	        while ((start <= end) && (A[start] < pivot)) {
	            start++;
	        }
	 
	        // scan for values greater than the pivot
	        while ((end >= start) && (A[end] >= pivot)) {
	            end--;
	        }	 
	        if (start > end) {
	            // swap the end uncoformed 
	            // element with the pivot
	            swap(A, pivotPosition, end); 
	        }
	        else {
	            // swap unconformed elements:
	            // start that was not lesser than the pivot 
	            // and end that was not larger than the pivot
	            swap(A, start, end);
	        }
	    }
	    return end;
	}
	 
	@SuppressWarnings("unused")
	private static int orderStatisticRecursive(int[] A, int k, int start, int end) {
	            
	    int pivotPosition = partition(A, start, end);
	    if ( pivotPosition == k - 1) {
	        return A[k - 1];
	    }
	    if (k - 1 < pivotPosition ) {
	        return orderStatisticRecursive(A, k, start, pivotPosition - 1);
	    }
	    else {
	        return orderStatisticRecursive(A, k, pivotPosition + 1, end);
	    }
	}
	 
	// iterative version
	private static int orderStatistic(int[] A, int k, int start, int end) {
	    int pivotPosition = partition(A, start, end);
	 
	    while (pivotPosition != k - 1) {
	        if (k - 1 < pivotPosition) {
	            end = pivotPosition - 1;
	        }
	        else {
	            start = pivotPosition + 1;
	        }
	        
	        pivotPosition = partition(A, start, end);
	    }
	    
	    return A[k - 1];
	}
	public static int kthSmallest(int[] A, int k) {
	    return orderStatistic(A, k, 0, A.length - 1);
	}
	
	public static void swap(int[] A, int i, int j){
		int temp = A[i];
		A[i]= A[j];
		A[j] = temp;
	}	
}
