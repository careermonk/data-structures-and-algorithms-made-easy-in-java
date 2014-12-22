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

public class AddOneToNumber {
	public int[] addOneToNumber(int[] digits) {
		int[] result = new int[digits.length];
		int one = 1;
		
		for(int i = digits.length-1;i>=0;i--){
			result[i] = (digits[i]+one) % 10;
			one = (digits[i]+one) / 10;
		}
		
		if(one!=0){
			int[] more = new int[digits.length+1];
			more[0] = one;
			System.arraycopy(result, 0, more, 1, result.length);
			result = more;
		}
		return result;		
	}
}