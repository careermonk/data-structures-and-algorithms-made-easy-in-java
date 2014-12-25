/*Copyright (c) Dec 25, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: NPower3By2Complexity.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter01introduction;

public class NPower3By2Complexity {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		System.out.println(nPower3By2(n));
	}
	public static int nPower3By2(int n){
		int i=1, j;
		int count = 0;
		int sum = 0;
		for (i = 0; i <n; i++){
			j = 0;
			while(sum<i){
				sum = sum + j;
				j++;
				count++;
			}			
		}
		return count;
	}
}
