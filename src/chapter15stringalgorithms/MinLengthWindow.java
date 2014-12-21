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

public class MinLengthWindow {
    public String minWindow(String input, String chars) {
        int inputLen = input.length();
        int charsLen = chars.length();
        
        // initialize needToFind array
        int[] needToFind = new int[256];
        for(int i = 0; i < charsLen; i++) {
            needToFind[chars.charAt(i)]++;
        }
        
        int[] hasFound = new int[256];
        int minWinLen = Integer.MAX_VALUE;
        int minWinBegin = 0;
        int minWinEnd = 0;
        int count = 0;
        for(int begin = 0, end = 0; end < inputLen; end++) {
            // skip characters not in chars 
            if(needToFind[input.charAt(end)] == 0)
                continue;
            hasFound[input.charAt(end)]++;
            if(hasFound[input.charAt(end)] <= needToFind[input.charAt(end)])
                count++;
            // if window constraint is satisfied
            if(count == charsLen) {
                // advance begin index as far as possible, stop when advancing breaks window constraint.
                while(needToFind[input.charAt(begin)] == 0 || hasFound[input.charAt(begin)] > needToFind[input.charAt(begin)]) {
                    if(hasFound[input.charAt(begin)] > needToFind[input.charAt(begin)])
                        hasFound[input.charAt(begin)]--;
                    begin++;
                }
                // update minWindow if a minimum length is satisfied
                int windowLen = end - begin + 1;
                if(windowLen < minWinLen) {
                    minWinBegin = begin;
                    minWinEnd = end;
                    minWinLen = windowLen;
                }
            }
        }
        return (count == charsLen) ? input.substring(minWinBegin, minWinEnd + 1)	: "";
    }
}