/*Copyright (c) Jan 10, 2016 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: RomanToDecimal.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter21miscconcepts;

import java.util.ArrayList;
import java.util.List;

public class RomanToDecimal {
	public static int romanToDecimal(java.lang.String romanNumber) {
	    int decimal = 0;
	    int lastNumber = 0;
	    if(romanNumber.isEmpty())
	    	return 0;
	    String romanNumeral = romanNumber.toUpperCase();

        /* operation to be performed on upper cases even if user enters Roman values in lower case chars */
	    for (int x = romanNumeral.length() - 1; x >= 0 ; x--) {
	        char convertToDecimal = romanNumeral.charAt(x);
	
	        switch (convertToDecimal) {
	            case 'M':
	                decimal = processDecimal(1000, lastNumber, decimal);
	                lastNumber = 1000;
	                break;
	
	            case 'D':
	                decimal = processDecimal(500, lastNumber, decimal);
	                lastNumber = 500;
	                break;
	
	            case 'C':
	                decimal = processDecimal(100, lastNumber, decimal);
	                lastNumber = 100;
	                break;
	
	            case 'L':
	                decimal = processDecimal(50, lastNumber, decimal);
	                lastNumber = 50;
	                break;
	
	            case 'X':
	                decimal = processDecimal(10, lastNumber, decimal);
	                lastNumber = 10;
	                break;
	
	            case 'V':
	                decimal = processDecimal(5, lastNumber, decimal);
	                lastNumber = 5;
	                break;
	
	            case 'I':
	                decimal = processDecimal(1, lastNumber, decimal);
	                lastNumber = 1;
	                break;
	                
	            default: 
	            	return -1;
	                
	        }
	    }
	    
	    return decimal;
	}

	public static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
	    if (lastNumber > decimal) {
	        return lastDecimal - decimal;
	    } else {
	        return lastDecimal + decimal;
	    }
	}
	
	public static void main(java.lang.String args[]) {
		List<String> romanList = new ArrayList<String>();
		romanList.add("");
		romanList.add("MMDCDXLIV");
		romanList.add("MMLVII");
		romanList.add("100");
		romanList.add("MMDCDXLV");
		romanList.add("VIV");
		romanList.add("MIX");
		romanList.add("LID");
		romanList.add("DIX");
		romanList.add("LICX");
		romanList.add("CLIX");
		romanList.add("MMDLIV");
		romanList.add("MMXDLIV");
		romanList.add("MCMXCX");
		romanList.add("CCCXCIX5");
		for (int i=0; i<romanList.size();i++){
			int decimalValue = romanToDecimal(romanList.get(i));
			if (decimalValue == -1)
				System.out.println("Not a valid Roman Number.");
			else
				System.out.println(decimalValue);
		}
	}
 }