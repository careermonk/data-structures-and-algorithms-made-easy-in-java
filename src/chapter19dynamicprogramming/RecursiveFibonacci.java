/*Copyright (c) Dec 25, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: RecursiveFibonacci.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter19dynamicprogramming;

public class RecursiveFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(recursiveFibonacci(5));
	}
    public static int recursiveFibonacci(int n) {
		if(n == 0) 
			return 0;
		if(n == 1) 
			return 1;
		return recursiveFibonacci(n -1) + recursiveFibonacci(n -2);
    }

}
