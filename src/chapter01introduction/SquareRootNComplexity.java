/*Copyright (c) Dec 25, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: SquareRootNComplexity.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter01introduction;

public class SquareRootNComplexity {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		System.out.println(squareRootN(n));
	}
	public static int squareRootN(int n){
		int i=1;
		int sum = 0;
		while(sum<n){
			sum = sum + i;
			i++;
		}
		return i-1;
	}
}
