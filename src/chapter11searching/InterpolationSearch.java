/*Copyright (c) Dec 12, 2015 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: InterpolationSearch.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter11searching;

public class InterpolationSearch {
    public static int interpolationSearch(int[] A, int data){
        int low = 0, high = A.length - 1, mid;
        while (A[low] <= data && A[high] >= data){
            if (A[high] - A[low] == 0)
                return (low + high)/2;
            /** out of range is possible  here **/
             mid = low + ((data - A[low]) * (high - low)) / (A[high] - A[low]);  
 
             if (A[mid] < data)
                 low = mid + 1;
             else if (A[mid] > data)
                 high = mid - 1;
             else
                 return mid;
        }
        if (A[low] == data)
            return low;
           /** not found **/
        else
            return -1; 
    }      
    public static void main(String args[]){
        int A[] = {-30,-16,-9,3,10,11,18,22,54,84,105};
        for(int i=0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
        int data = -9;
        int result = InterpolationSearch.interpolationSearch(A, data);
        
        if (result == -1)
            System.out.println("\n"+ data +" element not found");
        else
            System.out.println("\n"+ data +" elemnt found at position "+ result);
    }
}
