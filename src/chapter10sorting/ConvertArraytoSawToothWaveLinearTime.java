/*Copyright (c) Jul 3, 2015 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: ConvertArraytoSawToothWaveLinearTime.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter10sorting;

public class ConvertArraytoSawToothWaveLinearTime {
    public void convertArraytoSawToothWaveLinearTime(int A[]){
        // Traverse all even elements
        for (int i = 0; i < A.length; i+=2){
            // If current even element is smaller than previous
            if (i>0 && A[i-1] > A[i] )
                swap(A, i, i-1);
            // If current even element is smaller than next
            if (i<A.length-1 && A[i] < A[i+1] )
                swap(A, i, i+1);
        }
    }
    private void swap(int A[],int low,int high){
        int temp = A[low];
        A[low] = A[high];
        A[high] = temp;
    }
    
    public static void main(String args[]){
    	ConvertArraytoSawToothWaveLinearTime convertedArray = new ConvertArraytoSawToothWaveLinearTime();
        int A[] = {0,-6,9,13,10,-1,8,12,54,14,-5};
        for(int i=0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
        convertedArray.convertArraytoSawToothWaveLinearTime(A);
        for(int i=0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
    }
}
