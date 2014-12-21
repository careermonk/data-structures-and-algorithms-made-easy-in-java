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

public class EditDistance {
    public int editDistance(String A, String B) {
        int[][] Table = new int[A.length() + 1][B.length() + 1];
        // Initialization
        for(int i = 0; i <= A.length(); i++)
            Table[i][0] = i;
        for(int i = 0; i <= B.length(); i++)
            Table[0][i] = i;
        for(int i = 1; i <= A.length(); i++){
            for(int j = 1; j <= B.length(); j++){
                if(A.charAt(i - 1) == B.charAt(j - 1)){
                    Table[i][j] = Table[i - 1][j - 1];
                }else{
                    Table[i][j] = 1 + Math.min(Table[i - 1][j - 1], Math.min(Table[i - 1][j], Table[i][j - 1]));
                }
            }
        }
        return Table[A.length()][B.length()];
    }
}
