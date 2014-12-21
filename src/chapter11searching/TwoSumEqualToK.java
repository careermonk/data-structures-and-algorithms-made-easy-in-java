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

import java.util.HashMap;

public class TwoSumEqualToK {
    public int[] twoSumK(int[] A, int K) {
        if(A.length < 2) return null;
        int[] res = new int[2];
        // HashMap<value, index>;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < A.length; i++){
            if(map.containsKey(A[i])){
                res[0] = map.get(A[i]) + 1;
                res[1] = i + 1;           
            }else{
                map.put(K - A[i], i);
            }
        }
        return res;
    }
}
