/*Copyright (c) Dec 22, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: AddOneToNumber.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter21miscconcepts;

public class SquareMatrixRotationByOneElement {
	int[][] rotateByOneElementClockwise(int[][] matrix) {

        final int n = matrix.length;
        int[][] roataedMatrix = new int[n][n];
        for(int i = 0 ; i < n; i++) {
            for(int j = 0 ; j < n; j++) {
                if(i+j<n-1 && i<=j) {
                    // move right
                    roataedMatrix[i][j+1] = matrix[i][j];
                } else if(i+j>n-1 && i>=j) {
                    // move left
                    roataedMatrix[i][j-1] = matrix[i][j];
                } else if(i+j<=n-1 && i>j){
                    // move up
                    roataedMatrix[i-1][j] = matrix[i][j];
                } else if(i+j>=n-1 && i<j) {
                    // move down
                    roataedMatrix[i+1][j] = matrix[i][j];
                } else {
                    roataedMatrix[i][j] = matrix[i][j];
                }
            }
        }
        return roataedMatrix;
    }
}