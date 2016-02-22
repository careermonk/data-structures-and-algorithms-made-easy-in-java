/*Copyright (c) Feb 22, 2016 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: SkyLineBruteForce.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter18divideandconquer;

import java.util.Scanner;

public class SkyLineBruteForce {
    public static void main(String[] args) {
        int[] auxHeights = new int[1000];
        int rightMostBuildingRi = 0;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int left = in.nextInt(), h = in.nextInt(), right = in.nextInt();
            for (int i = left; i < right; i++)
                auxHeights[i] = Math.max(h, auxHeights[i]);
            if(rightMostBuildingRi<right)
            	rightMostBuildingRi=right;	
        }
        int prev=0, left=-1, right = -1;
        for (int i = 0; i < rightMostBuildingRi; i++) {
            if (prev != auxHeights[i]) {
                if(left > 0) System.out.print(left +" "+ right + " ");
                prev = auxHeights[i];
                left =i;
                right =prev;
            }
        }
        System.out.println(left +" "+ right );
    }
}