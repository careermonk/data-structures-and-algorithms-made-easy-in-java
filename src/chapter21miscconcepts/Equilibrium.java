package chapter21miscconcepts;
/*Copyright (c) Dec 22, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: Equilibrium.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

public class Equilibrium {	
	public static int equilibrium(int[] A){
		int sum = 0;
		int leftsum = 0;
		int i;
		
		for(i = 0;i<A.length;i++){
			sum += A[i];
		}
		
		for(i = 0; i<A.length;i++){
			sum -= A[i];
			if(leftsum == sum){
				return i;
			}
			leftsum += A[i];
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] A = {-7,1,5,2,-4,3,0};
		System.out.print(equilibrium(A));	// Would Print 3
	}
}