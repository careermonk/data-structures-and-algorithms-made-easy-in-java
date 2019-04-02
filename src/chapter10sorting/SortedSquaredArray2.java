/*Copyright (c) Jul 2, 2015 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: ConvertArraytoSawToothWave.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */
 
package chapter10sorting;
 
class SortedSquaredArray {
  public int[] sortedSquaredArray(int[] A) {
      int n = A.length;
      int j = 0;
      // Find the last index of the negative numbers
      while (j < n && A[j] < 0)
          j++;
      // i points to the last index of negative numbers
      int i = j-1;

      int[] result = new int[n];
      int t = 0;
      // j points to the first index of the positive numbers
      while (i >= 0 && j < n) {
          if (A[i] * A[i] < A[j] * A[j]) {
              result[t++] = A[i] * A[i];
              i--;
          } else {
              result[t++] = A[j] * A[j];
              j++;
          }
      }
      // add the remaining negative numbers squares to result
      while (i >= 0) {
          result[t++] = A[i] * A[i];
          i--;
      }

      // add the remaining positive numbers squares to result
      while (j < n) {
          result[t++] = A[j] * A[j];
          j++;
      }

      return result;
  }
}
