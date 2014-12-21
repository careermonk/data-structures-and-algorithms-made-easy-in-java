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

public class MaxSubSquareMatrixWith1s {
	public static void maxSubSquareMatrixWith1s(int[][] A) {
		final int n = A.length;
		final int m = A[0].length;

		// will hold the size of the largest square sub-matrix with all 1s including L[i][j]
		// where L[i][j] is the rightmost and "bottommost" cell of the sub-matrix.
		int[][] L = new int[n][m];

		// L[:][0] = A[:][0]
		for(int i = 0; i < n; i++) {
			L[i][0] = A[i][0];
		}
		// L[0][:] = A[0][:]
		for(int j = 0; j < m; j++) {
			L[0][j] = A[0][j];
		}

		for(int i = 1; i < n; i++) {
			for(int j = 1; j < m; j++) {
				if(A[i][j] == 1) {
					L[i][j] = Math.min(Math.min(L[i][j - 1], L[i - 1][j]), L[i - 1][j - 1]) + 1;
				} else {
					L[i][j] = 0;
				}
			}
		}
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				max = Math.max(max, L[i][j]);
			}
		}
		System.out.print("Result::"+max); 
	}
    public static void main(String[] args) {
        int A[][] = {{0, 1, 1, 0, 1},
                {1, 1, 0, 1, 0},
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0}
               };
        maxSubSquareMatrixWith1s(A);
    }		
}
