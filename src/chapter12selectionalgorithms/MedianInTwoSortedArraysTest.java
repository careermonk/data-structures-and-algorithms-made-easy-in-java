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

package chapter12selectionalgorithms;
public class MedianInTwoSortedArraysTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []A = {2,5,7,9,10,15,20,35};
		int []B = {1,5,7,9,10,30,50,70};
		MedianInTwoSortedArrays m = new MedianInTwoSortedArrays();
		System.out.println(m.findMedianSortedArrays(A, B));
	}
}
