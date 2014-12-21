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

public class WildCardMatch {
    public boolean wildCardMatch(String text, String pattern) {
        int lenText = text.length();
        int lenPattern = pattern.length();
        if(lenText == 0 && lenPattern == 0) 
            return true;
        int i = 0, j = 0;
        // save the last matched index
        int startText = -1, startPattern = -1;
        while (i < lenText) {
            if (j < lenPattern && (text.charAt(i) == pattern.charAt(j) || pattern.charAt(j) == '?')) {
                i++;
                j++;
            } else if (j < lenPattern && pattern.charAt(j) == '*') {
                while(j < lenPattern && pattern.charAt(j) == '*') 
                    j++;
                if(j == lenPattern)
                    return true;
                startPattern = j;
                startText = i;
            } else if ((j >= lenPattern || text.charAt(i) != pattern.charAt(j)) && startPattern > -1) {
                startText++;
                j = startPattern;
                i = startText;
            } else {
                return false;
            }
        }
        while (j < lenPattern) {
            if (pattern.charAt(j) != '*')
                return false;
            j++;
        }
        return true;
    }
}