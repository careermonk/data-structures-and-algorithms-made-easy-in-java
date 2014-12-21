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

public class MissingNumberFromTwiceRepetitions {
	public int singleMissingNumber(int[] A){
	    int missingNum = A[0];
	    for(int i = 1; i < A.length; i++){
		missingNum ^= A[i];
	    }
	    return missingNum;
	}
}
