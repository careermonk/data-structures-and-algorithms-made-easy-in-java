/*Copyright (c) Dec 25, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: NSquareLogNComplexity.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter01introduction;

public class NSquareLogNComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		System.out.println(nSquareLogN(n));
		System.out.println(nSquareLogN2(n));
		System.out.println(nSquareLogN3(n));
	}
	public static int nSquareLogN(int n){
		int count = 0;
		for (int i = 1; i<n;i = i *2){
			for (int j = 1; j<n;j++){
				for (int k = 1; k<n;k++){
					count ++;
				}
			}
		}
		return count;
	}
	public static int nSquareLogN2(int n){
		int count = 0;
		for (int i = 1; i<n;i = i+1 ){
			for (int j = 1; j<n;j = j*2){
				for (int k = 1; k<n;k = k + 1){
					count ++;
				}
			}
		}
		return count;
	}
	public static int nSquareLogN3(int n){
		int count = 0;
		for (int i = 1; i<n;i++){
			for (int j = 1; j<n;j++){
				for (int k = 1; k<n;k =  k *2){
					count ++;
				}
			}
		}
		return count;
	}
}
