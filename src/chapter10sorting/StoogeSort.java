/*Copyright (c) 5 de out. de 2020 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: StoogeSort.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package chapter10sorting;

import java.util.Arrays;

public class StoogeSort {
    public static void main(String[] args) {
        int[] nums = {1, 4, 5, 3, -6, 3, 7, 10, -2, -5};
        stoogeSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void stoogeSort(int[] L) {
        stoogeSort(L, 0, L.length - 1);
    }

    public static void stoogeSort(int[] L, int i, int j) {
        if (L[j] < L[i]) {
            int tmp = L[i];
            L[i] = L[j];
            L[j] = tmp;
        }
        if (j - i > 1) {
            int t = (j - i + 1) / 3;
            stoogeSort(L, i, j - t);
            stoogeSort(L, i + t, j);
            stoogeSort(L, i, j - t);
        }
    }
}
