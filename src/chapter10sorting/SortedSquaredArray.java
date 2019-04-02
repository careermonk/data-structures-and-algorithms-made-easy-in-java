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
      int[] result = new int[n];
      for (int i = 0; i < n; ++i)
          result[i] = A[i] * A[i];

      Arrays.sort(result);
      return result;
  }
}
