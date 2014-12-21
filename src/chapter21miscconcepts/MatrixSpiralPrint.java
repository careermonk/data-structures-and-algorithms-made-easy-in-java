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

package chapter21miscconcepts;

public class MatrixSpiralPrint {
    public void Spiral(int[][]A, int m, int n) { 
        int rowStart=0, columnStart=0;      
        int rowEnd=m-1, columnEnd=n-1;  
        while(rowStart<=rowEnd && columnStart<=columnEnd) {
               int i=rowStart, j=columnStart;
               for(j=columnStart; j<=columnEnd; j++) System.out.print(" "+A[i][j]);
               for(i=rowStart+1, j--; i<=rowEnd; i++) System.out.print(" "+A[i][j]);
               for(j=columnEnd-1, i--; j>=columnStart; j--) System.out.print(" "+A[i][j]);
               for(i=rowEnd-1, j++; i>=rowStart+1; i--) System.out.print(" "+A[i][j]);
               rowStart++; columnStart++; rowEnd--; columnEnd--;
        }	
    }
}
