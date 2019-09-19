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
 
 import java.util.*;
import java.lang.*;
import java.io.*;
public class CountingSorter{
    public static int[] CountingSort (int[] A, int K) {
        int i, j, n = A.length; 
        int[] C = new int[K+1];
        int[] B = new int[n+1];
        // Complexity: O(K) 
        for (i =0 ; i <= K; i++) 
            C[i] = 0; 
            
        // Complexity: O(n) 
        for (j = 0 ; j < n; j++) 
            C[A[j]] = C[A[j]] + 1;
        // C[i] now contains the number of elements equal to i 

        // Complexity: O(K) 
        for (i =1 ; i <= K; i++) 
            C[i] = C[i] + C[i-1];
        // C[i] now contains the number of elements ≤ i 
        
        // Complexity: O(n) 
        for (j = n-1; j>=0; j--) { 
			B[C[A[j]]] = A[j]; 
            C[A[j]] = C[A[j]] - 1; 
        }
        return B;
    }
    public static void main(String[] args) {

      System.out.println("Counting sort in Java");
      int[] A = { 6, 4, 3, 2, 1, 4, 3, 6, 6, 2, 4, 3, 4 };
      int K = 6;
      int[] B = new int[A.length + 1];

      System.out.println("Input Array:");
      System.out.println(Arrays.toString(A));

      // sorting array using Counting Sort Algorithm
      B = CountingSort(A, K);

      System.out.println("Sorted array");
      System.out.println(Arrays.toString(B));

    }
}
