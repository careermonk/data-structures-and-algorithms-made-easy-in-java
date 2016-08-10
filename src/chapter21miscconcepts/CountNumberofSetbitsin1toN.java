/*Copyright (c) Dec 22, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: CheckEndian.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter21miscconcepts;

public class CountNumberofSetbitsin1toN {
	public int countNumberofSetbitsin1toN(int n) {
		long i = 0, j, count = 0; 
		for (i = 1; i<=n; i++){
			j = i;
			while(j>0) {
			     count++;
			     j = j & (j - 1); 
			}
		}
		return count;		
	}
}