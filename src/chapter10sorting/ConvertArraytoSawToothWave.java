/*Copyright (c) Jul 2, 2015 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: ConvertArraytoSawToothWave.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter10sorting;

import java.util.Arrays;

public class ConvertArraytoSawToothWave {
   
    /**
     * Sort the array first.
     * Then swap every adjacent element to get final result
     * @param A
     */
    public void converttoSawToothWave(int A[]){
        for(int i=1; i < A.length; i+=2){
            if(i+1 < A.length){
                swap(A, i, i+1);
            }
        }
    }
    private void swap(int A[],int low,int high){
        int temp = A[low];
        A[low] = A[high];
        A[high] = temp;
    }
    
    public static void main(String args[]){
        ConvertArraytoSawToothWave convertedArray = new ConvertArraytoSawToothWave();
        int A[] = {0,-6,9,13,10,-1,8,12,54,14,-5};
        Arrays.sort(A);
        for(int i=0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();

        convertedArray.converttoSawToothWave(A);
        for(int i=0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
    }
}