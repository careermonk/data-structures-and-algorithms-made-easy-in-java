/*Copyright (c) Jul 2, 2015 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: SwapOddEvenBits.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter21miscconcepts;

public class SwapOddEvenBits {

    public int swap(int num){
        int mask1 = 0xAAAAAAAA;
        int mask2 = 0x55555555;
        return (num << 1 & mask1) | ( num >> 1 & mask2);
    }
    
    public static void main(String args[]){
        SwapOddEvenBits soe = new SwapOddEvenBits();
        System.out.println(soe.swap(697));
    }
}