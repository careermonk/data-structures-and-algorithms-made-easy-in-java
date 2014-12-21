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

package chapter15stringalgorithms;

import java.util.ArrayList;

public class NumberCombinations {
    public ArrayList<ArrayList<Integer>> numberCombinations(int n, int k) {
        if(n < k)
            return null;
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(k == 1){
            for(int i = 1; i <= n; i++){
                ArrayList<Integer> arr = new ArrayList<Integer>();
                arr.add(i);
                res.add(arr);
            }
            return res;
        }
        for(int i = n; i>= k; i--){
            for(ArrayList<Integer> arr : numberCombinations(i - 1, k - 1)){
                arr.add(i);
                res.add(arr);
            }
        }
        return res;
    }
}
