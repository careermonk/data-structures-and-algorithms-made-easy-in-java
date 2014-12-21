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

public class DutchNationalFlag {
	public static int[] dutchNationalFlag(int[] A) {
        int mid = -1;   		//tracks 1
        int left = 0;     		//tracks 0
        int right = A.length;  	//tracks 2
        while(left < right){
            if(A[left] == 0){
            	    mid++;
                int temp = A[left];
                A[left] = A[mid];
                A[mid] = temp;
                // left move forward as well. 
                left++;
            }else if(A[left] == 2){
                right--;
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;
            }else
                left++;
        }
        return A;
	}    
	public static void main(String [] args){
		int[] A = {2,1,0,2,2,1,1,0,0,0};
		A = dutchNationalFlag(A);
		for(int i =0;i<A.length;i++){
			System.out.print("   " + A[i]);
		}
	}
}
