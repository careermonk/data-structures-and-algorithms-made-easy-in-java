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

package chapter19dynamicprogramming;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class OptimalJumps {

    private OptimalJumps() {}

    public static Collection<Integer> optimalJumps (int[] A) {
        int[] jumpLength = new int[A.length];
        int[] prevIndex = new int[A.length];
        for (int i = 1; i < A.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                int diff  = i - j; // calculate differences in array indexes
                // if jump is possible && if this the shortest jump from the start 
                if ((A[j] >= diff) && (jumpLength[j] < min)) {
                        min = jumpLength[j] + 1;
                        jumpLength[i] = min;
                        prevIndex[i] = j;
                    }
                }
        }
        List<Integer> list = new ArrayList<Integer>();
        int ctr = A.length - 1;
        while (ctr > 0) {
            list.add(ctr);
            ctr = prevIndex[ctr];
        }
        list.add(0);
        Collections.reverse(list);
        return Collections.unmodifiableCollection(list);
    }

    public static void main(String[] args) {
        int[] a1 = {2,3,1,1,4};
        System.out.print("Expected: 0:1:4, Actual: ");
        for (Integer i : optimalJumps (a1)) {
            System.out.print(i + ":");
        }
        System.out.println();
        int[] a2 = {3, 1, 10, 1, 4};
        System.out.print("Expected: 0:3:4, Actual: ");
        for (Integer i : optimalJumps (a2)) {
            System.out.print(i + ":");
        }
    }
}
