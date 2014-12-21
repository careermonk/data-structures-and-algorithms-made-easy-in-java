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

public class GenerateNextNumFromReading {
    public String generateNextNumFromReading(int n) {
        StringBuilder str = new StringBuilder("1");
        while(n-- > 1){
            StringBuilder temp = new StringBuilder();
            int count = 1;
            for(int i = 1; i < str.length(); i++){
                if(str.charAt(i) == str.charAt(i - 1))
                    count++;
                else{
                    // appending..
                    temp.append(count);
                    temp.append(str.charAt(i - 1));
                    count = 1;
                }
            }
            temp.append(count);
            temp.append(str.charAt(str.length() - 1));
            str = temp;
        }
        return str.toString();
    }
}
